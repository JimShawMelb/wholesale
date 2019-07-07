package com.example.wholesale.controller;

import com.example.wholesale.jpa.AccountRepository;
import com.example.wholesale.jpa.CustomerRepository;
import com.example.wholesale.jpa.TransactionRepository;
import com.example.wholesale.model.Account;
import com.example.wholesale.model.Customer;
import com.example.wholesale.model.Transaction;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerResource {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    // List of customers (outside scope)
    @GetMapping("/customer")
    public final List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Hitting a customer by ID returns the account list owned by the customer
    @GetMapping("/customer/{customerId}")
    public final List<Account> getCustomerAccounts(
            @PathVariable final long customerId) {
        validateCustomerId(customerId);
        return accountRepository.findByCustomerId(customerId);
    }

    // Hitting a customer-account returns the account transaction list
    @GetMapping("/customer/{customerId}/{accountNumber}")
    public final List<Transaction> getCustomerAccounts(
            @PathVariable final long customerId,
            @PathVariable final long accountNumber) {
        validateCustomerId(customerId);
        Account account = validateAccountNumber(accountNumber);
        // Ensure that the account belongs to the customer
        if (account.getCustomerId() == customerId) {
            return transactionRepository.findByAccountNumber(accountNumber);
        }
        throw new UnauthorisedException();
    }

    private Customer validateCustomerId(final long customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        if (!customer.isPresent()) {
            throw new CustomerNotFoundException();
        }
        return customer.get();
    }

    private Account validateAccountNumber(final long accountNumber) {
        Optional<Account> account = accountRepository.findById(accountNumber);
        if (!account.isPresent()) {
            throw new AccountNotFoundException();
        }
        return account.get();
    }
}

