package com.epam.poland.lesson5;

public enum Color {
    RED("червоний"),
    GREEN("зелений"){
        @Override
        public void method(){
            System.out.println("method overriding");
        }
    },
    YELLOW("жовтий");

    private String ukraineName;

    private Color(String ukraineName) {
        this.ukraineName = ukraineName;
    }

    public String getUkraineName() {
        return ukraineName;
    }

    public void setUkraineName(String ukraineName) {
        this.ukraineName = ukraineName;
    }

    public void method(){
        System.out.println("general method");
    }

    public static void main(String[] args) {
        System.out.println(RED.getUkraineName());
        RED.setUkraineName("ч");
        System.out.println(RED.getUkraineName());
        RED.method();
        GREEN.method();
    }
}


