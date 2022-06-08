package com.epam.poland.module2.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserRunner {
    public static void main(String[] args) {
        User alex = User.builder()
                .withAddress(new Address(new City("Kyiv")))
                .withName("Alex")
                .withSurname("Duda")
                .build();

        User volodimir = User.builder()
                .withAddress(new Address(new City("Kyiv")))
                .withName("Volodimir")
                .withSurname("Zelenski")
                .build();

        User mihailo = User.builder()
                .withAddress(new Address(new City("London")))
                .withName("Mihailo")
                .withSurname("Iavanov")
                .build();

        List<User> users = Arrays.asList(alex, volodimir, mihailo);
        // User  ----> user ---> string(name)
        List<String> names = users.stream()
                .map(user -> user.getName())
                .collect(Collectors.toList());

//        Object collect = users.stream()
//                .map(user -> user.getName())
//                .collect(new StringCollector<>(users.stream().map(x->x.getName()).max().));


    }
}
