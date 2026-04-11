package com.danielpredel.javarecap.oop;

public class User extends Person {

    // Basic model class used to demonstrate object creation and encapsulation.

    private Long id;
    private String email;

    public User(Long id, String name, String email) {
        super(name);
        this.id = id;
        this.email = email;
    }

    public void showRole() {
        System.out.println("I am a simple user");
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id  = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name  = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{id=" + this.id + ", " + this.name + "', email=" + this.email + "}";
    }
}
