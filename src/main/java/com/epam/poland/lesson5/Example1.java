package com.epam.poland.lesson5;

public class Example1  {
    public Example1 (){
        //
    }
}

enum Type{

}

class User{
    String name;
    String email;
    String login;
    String password;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + "*******" + '\'' +
                '}';
    }
}
