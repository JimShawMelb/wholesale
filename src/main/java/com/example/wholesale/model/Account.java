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
public class Account {
    @Id
    @GeneratedValue
    private Long accountNumber;
    private String accountName;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private LocalDateTime balanceDate;
    private Currency currency;
    private BigDecimal balance;
    private long customerId;
    public final Long getAccountNumber() {
        return accountNumber;
    }
    public final Account setAccountNumber(final Long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public final String getAccountName() {
        return accountName;
    }
    public final Account setAccountName(final String accountName) {
        this.accountName = accountName;
        return this;
    }
    public final AccountType getAccountType() {
        return accountType;
    }
    public final Account setAccountType(final AccountType accountType) {
        this.accountType = accountType;
        return this;
    }
    public final LocalDateTime getBalanceDate() {
        return balanceDate;
    }
    public final Account setBalanceDate(final LocalDateTime balanceDate) {
        this.balanceDate = balanceDate;
        return this;
    }
    public final Currency getCurrency() {
        return currency;
    }
    public final Account setCurrency(final Currency currency) {
        this.currency = currency;
        return this;
    }
    public final BigDecimal getBalance() {
        return balance;
    }
    public final Account setBalance(final BigDecimal balance) {
        this.balance = balance;
        return this;
    }
    public final long getCustomerId() {
        return customerId;
    }
    public final Account setCustomerId(final long customerId) {
        this.customerId = customerId;
        return this;
    }
}
