//package com.finance.frauddetection.controllers;
//
//import com.finance.frauddetection.model.Transaction;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/fraud-alerts")
//
//public class FraudAlertController {
//
//    @GetMapping
//    public String getAll() {return "All Fraud List"; }
//
//    @PutMapping
//
//    private List<Transaction> transactions = new ArrayList<>();
//
//    public List<Transaction> getAll() {
//        return transactions;
//    }
//
//    public List<Transaction> getOpenAlerts() {
//        return transactions;
//    }
//
//    public void updateStatus(int id, String status) {
//        for (Transaction t : transactions) {
//            if (t.getId() == id) {
//                t.setStatus(status);
//            }
//        }
//    }
//}