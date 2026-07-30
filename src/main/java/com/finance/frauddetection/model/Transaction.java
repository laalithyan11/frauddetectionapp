package com.finance.frauddetection.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private int id;
    private int customerId;
    private BigDecimal amount;
    private String txnCountry;
    private LocalDateTime txnTimestamp;
    private String status; // PROCESSED / FLAGGED

    // Default Constructor
    public Transaction() {
    }

    // Parameterized Constructor
    public Transaction(int id, int customerId, BigDecimal amount,
                       String txnCountry, LocalDateTime txnTimestamp,
                       String status) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.txnCountry = txnCountry;
        this.txnTimestamp = txnTimestamp;
        this.status = status;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for customerId
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getter and Setter for amount
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    // Getter and Setter for txnCountry
    public String getTxnCountry() {
        return txnCountry;
    }

    public void setTxnCountry(String txnCountry) {
        this.txnCountry = txnCountry;
    }

    // Getter and Setter for txnTimestamp
    public LocalDateTime getTxnTimestamp() {
        return txnTimestamp;
    }

    public void setTxnTimestamp(LocalDateTime txnTimestamp) {
        this.txnTimestamp = txnTimestamp;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}