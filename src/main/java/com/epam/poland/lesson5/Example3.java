package com.epam.poland.lesson5;

public class Example3 {
    public static void main(String[] args) {
        VipUser igor = new VipUser("Igor");
        System.out.println(igor.name);
    }
}

class BaseUser {
    public String name;
    public String id;

    public BaseUser(String name) {
        this.name = name;
    }

    public BaseUser() {
    }
}

class VipUser extends BaseUser {
    public String name;

    public VipUser(String name) {
        super.name = name;
        this.name = name;
        this.id = name;
    }
}
