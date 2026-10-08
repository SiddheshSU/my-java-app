package com.example;

public class App {
    public String greet() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet());
    }
}
