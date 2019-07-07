package com.example.wholesale;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.wholesale.jpa.AccountRepository;
import com.example.wholesale.model.Account;
import com.example.wholesale.model.AccountType;
import com.example.wholesale.model.Customer;

@RunWith(SpringRunner.class)
@DataJpaTest
public class WholesaleIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void test_account_findByCustomerId() {

        Customer dave = new Customer();
        dave.setName("dave");
        entityManager.persist(dave);

        Customer mary = new Customer();
        mary.setName("mary");
        entityManager.persist(mary);

        Account davesAccount = new Account();
        davesAccount.setCustomerId(dave.getId())
            .setAccountName("Dave's Account")
            .setAccountType(AccountType.Savings)
            .setBalance(new BigDecimal(12.34))
            .setCurrency(Currency.getInstance("AUD"))
            .setBalanceDate(LocalDateTime.parse("2007-12-03T10:15:30"));
        entityManager.persist(davesAccount);

        Account marysAccount = new Account();
        marysAccount.setCustomerId(mary.getId())
            .setAccountName("Mary's Account")
            .setAccountType(AccountType.Current)
            .setBalance(new BigDecimal(56.78))
            .setCurrency(Currency.getInstance("SGD"))
            .setBalanceDate(LocalDateTime.parse("2007-12-03T10:15:31"));
        entityManager.persist(marysAccount);

        assertThat(accountRepository.findByCustomerId(
            davesAccount
            .getCustomerId())
            .get(0)
            .getAccountName()
            .equals(davesAccount.getAccountName())
        );
    }
}
