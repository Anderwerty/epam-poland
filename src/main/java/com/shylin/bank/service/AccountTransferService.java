package com.shylin.bank.service;

import com.shylin.bank.entity.Account;
import com.shylin.bank.entity.User;
import com.shylin.bank.respository.AccountRepository;

// SOLID
public class AccountTransferService {
    private final AccountRepository accountRepository;

    public AccountTransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void transferMoney(User user, double amount, Integer accountIdToTransferFor) {
        Account account = user.getAccount();
        Integer accountId = account.getId();

        account = accountRepository.findById(accountId).get();

        if (account.getBalance() < amount) {
            throw new IllegalArgumentException();
        }

        Account accountToTransfer =
                accountRepository.findById(accountIdToTransferFor).get();

        Account countToTransferWithNewAmount =
                new Account(accountIdToTransferFor, accountToTransfer.getBalance() + amount);

        accountRepository.update(countToTransferWithNewAmount);

    }
}
