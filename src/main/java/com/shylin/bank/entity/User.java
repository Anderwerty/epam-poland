package com.shylin.bank.entity;

public class User {

    private final Integer id;
    private final String email;
    private final String password;
    private final Account account;

    public User(Integer id, String email, String password,
                Account account) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Account getAccount() {
        return account;
    }
}
