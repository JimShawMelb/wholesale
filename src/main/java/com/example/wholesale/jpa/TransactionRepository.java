package com.example.wholesale.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.wholesale.model.Transaction;

public interface TransactionRepository
    extends JpaRepository<Transaction, Long> {

    @Query("select t from Transaction t where t.accountNumber = ?1")
    List<Transaction> findByAccountNumber(long accountNumber);
}
