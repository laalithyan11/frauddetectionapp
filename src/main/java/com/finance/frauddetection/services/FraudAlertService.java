package com.finance.frauddetection.services;

import com.finance.frauddetection.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FraudAlertService {

    private List<Transaction> transactions = new ArrayList<>();

    public List<Transaction> getAll() {
        return transactions;
    }

    public List<Transaction> getOpenAlerts() {
        return transactions;
    }

    public void updateStatus(int id, String status) {
        for (Transaction t : transactions) {
            if (t.getId() == id) {
                t.setStatus(status);
            }
        }
    }
}