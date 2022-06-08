package com.shylin.bank.service;

import com.shylin.bank.entity.Account;
import com.shylin.bank.entity.User;
import com.shylin.bank.respository.AccountRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountTransferServiceTest {

    @Mock
    public AccountRepository accountRepository;

    @InjectMocks
    public AccountTransferService accountTransferService;

    @Test
    void test() {
        Account account = new Account(1, 100);
        User user = new User(1, "eamil", "password", account);
        when(accountRepository.findById(1)).thenReturn(Optional.of(account));

        assertThrows(IllegalArgumentException.class,
                () -> accountTransferService.transferMoney(user, 1000, 111));

        Mockito.verify(accountRepository, never()).update(any());
    }

}

