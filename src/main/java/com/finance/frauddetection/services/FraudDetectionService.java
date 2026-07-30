package com.finance.frauddetection.services;

import com.finance.frauddetection.model.Customer;
import com.finance.frauddetection.model.Transaction;
import com.finance.frauddetection.repository.CustomerRepository;
import com.finance.frauddetection.repository.ITransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class FraudDetectionService {

    private ITransactionRepository transactionRepository;
    private CustomerRepository customerRepository;

    public FraudDetectionService(ITransactionRepository transactionRepository,
                                 CustomerRepository customerRepository) {
        this.transactionRepository = transactionRepository;
        this.customerRepository = customerRepository;
    }

    public Transaction processTransaction(Transaction transaction) {

        // Save transaction
        int newGeneratedIdTxn = transactionRepository.save(transaction);
        transaction.setId(newGeneratedIdTxn);

        int riskScore = 0;
        List<String> reasons = new ArrayList<>();

        // Rule 1 - High Amount
        if (transaction.getAmount().compareTo(new BigDecimal("10000")) > 0) {
            reasons.add("High transaction amount: Rs. " + transaction.getAmount());
            riskScore += 40;
        }

        // Rule 2 - Odd Hours
        int hour = transaction.getTxnTimestamp().getHour();
        if (hour >= 0 && hour < 5) {
            reasons.add("Transaction made during odd hours (" + hour + ":00)");
            riskScore += 20;
        }

        // Rule 3 - Country Mismatch
        Customer customer = customerRepository.getCustomerById(transaction.getCustomerId());

        if (customer != null &&
                !customer.getRegisteredCountry().equalsIgnoreCase(transaction.getTxnCountry())) {

            reasons.add("Customer country mismatch - " + transaction.getTxnCountry());
            riskScore += 30;
        }

        // Update Status
        if (!reasons.isEmpty()) {
            transactionRepository.updateStatus(transaction.getId(),"FLAGGED");
        } else {
            transactionRepository.updateStatus(transaction.getId(),"SUCCESS");
        }

        return transaction;
    }
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(int id) {
        return transactionRepository.findById(id);
    }
}