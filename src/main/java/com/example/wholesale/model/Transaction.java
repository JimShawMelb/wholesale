package com.example.wholesale.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private long id;
    private long accountNumber;
    private LocalDateTime valueDate;
    private Currency currency;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private String narrative;
    public final long getId() {
        return id;
    }
    public final Transaction setId(final long id) {
        this.id = id;
        return this;
    }
    public final long getAccountNumber() {
        return accountNumber;
    }
    public final Transaction setAccountNumber(final long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public final LocalDateTime getValueDate() {
        return valueDate;
    }
    public final Transaction setValueDate(final LocalDateTime valueDate) {
        this.valueDate = valueDate;
        return this;
    }
    public final Currency getCurrency() {
        return currency;
    }
    public final Transaction setCurrency(final Currency currency) {
        this.currency = currency;
        return this;
    }
    public final BigDecimal getAmount() {
        return amount;
    }
    public final Transaction setAmount(final BigDecimal amount) {
        this.amount = amount;
        return this;
    }
    public final TransactionType getTransactionType() {
        return transactionType;
    }
    public final Transaction setTransactionType(
            final TransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public final String getNarrative() {
        return narrative;
    }
    public final Transaction setNarrative(final String narrative) {
        this.narrative = narrative;
        return this;
    }
}
