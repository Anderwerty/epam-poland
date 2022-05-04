package com.epam.poland.lesson12_16;

import java.util.Optional;

public class Example9 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findById(1);
//user.getAddress().getCity()
//        String cityName = Optional.ofNullable(user)
//                .map(User::getAddress)
//                .map(Address::getCity)
//                .filter(x->x.equals("Kyiv"))
//                        .orElseThrow(()->new RuntimeException("no city for user!"));
//                .orElse("Irpin");

//        System.out.println(cityName);


        String kyiv = Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity)
                .filter(x -> x.equals("Kyiv"))
                .orElseGet(() -> userRepository.findCity());

        Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity)
                .ifPresent(x-> System.out.println(x+ " under protection"));


        Optional<String> s = Optional.ofNullable(user)
                .map(User::getAddress)
                .flatMap(x -> Optional.ofNullable(x.getCity()));
    }
}

class User {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public User(Address address) {
        this.address = address;
    }
}

class Address {
    public String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class UserRepository {

    User findById(Integer id) {
        String gdansk = "Gdansk";
        Address address = new Address(gdansk);
        return new User(address);
    }

    String findCity(){
        return "Irpin";
    }
}
