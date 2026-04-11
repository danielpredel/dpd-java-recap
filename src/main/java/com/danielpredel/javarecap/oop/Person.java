package com.danielpredel.javarecap.oop;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name);
    }
}
