package com.epam.poland.module2.lesson2;

public class User {
    private final String name;
    private final String surname;
    private final Address address;

    public static Builder builder(){
        return new Builder();
    }

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }

    static class Builder {

        private String name;
        private String surname;
        private Address address;


        private Builder(){

        }

        public User build(){
            return new User(this);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }
    }
}
