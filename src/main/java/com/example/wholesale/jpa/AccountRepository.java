package com.example.wholesale.jpa;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.wholesale.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("select t from Account t where t.customerId = ?1")
    List<Account> findByCustomerId(long customerId);
}
