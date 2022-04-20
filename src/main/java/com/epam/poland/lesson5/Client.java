package com.epam.poland.lesson5;

public class Client {
    public static final String CLASS_NAME;

    public static int counter;

    static {
        counter = 0;
//        CLASS_NAME = "";
        System.out.println("static block 1");
//        method();
    }

    public int id;
    public boolean isAdmin;

    {
        this.isAdmin = true;
        System.out.println("not static block 1");
//        method();
    }

    public Client(int id) {
        System.out.println("constructor 1");
        this.isAdmin = false;
        this.id = id;
        counter++;
//        method();
    }

    {
        System.out.println("not static block 2");
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", isAdmin=" + isAdmin +
                '}';
    }

    static {
        System.out.println("static block 2");
        CLASS_NAME = "";
    }

    public static void method() throws Exception {
        throw new Exception();
    }
}

class ClientRunner {
    public static void main(String[] args) throws Exception {
        Client client1 = new Client(1);
        Client client2 = new Client(1);

        System.out.println(client1);

    }
}
