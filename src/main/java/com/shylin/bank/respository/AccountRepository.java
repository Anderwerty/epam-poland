package com.shylin.bank.respository;

import com.shylin.bank.entity.Account;

import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findById(Integer id);

    void update(Account account);
}
