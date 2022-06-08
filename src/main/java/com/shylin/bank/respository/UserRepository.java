package com.shylin.bank.respository;

import com.shylin.bank.entity.User;

import java.util.Optional;

public interface UserRepository {

    public Optional<User> findById(Integer id);
}
