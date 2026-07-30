package com.finance.frauddetection.controllers;

import com.finance.frauddetection.model.Transaction;
import com.finance.frauddetection.services.FraudDetectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final FraudDetectionService fraudDetectionService;

    public TransactionController(FraudDetectionService fraudDetectionService) {
        this.fraudDetectionService = fraudDetectionService;
    }

    // GET /api/transactions
    @GetMapping
    public List<Transaction> getAllTransactions() {
        return fraudDetectionService.getAllTransactions();
    }

    // GET /api/transactions/{id}
    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable int id) {
        return fraudDetectionService.getTransactionById(id);
    }

    // POST /api/transactions
    @PostMapping
    public Transaction processTransaction(@RequestBody Transaction transaction) {
        return fraudDetectionService.processTransaction(transaction);
    }
}