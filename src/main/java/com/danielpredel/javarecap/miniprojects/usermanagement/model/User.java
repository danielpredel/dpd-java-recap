package com.danielpredel.javarecap.miniprojects.usermanagement.model;

public class User {
    private final Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this(null, name, email);
    }

    public User(Long id, String name, String email) {
        validateName(name);
        validateEmail(email);
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        validateEmail(email);
        this.email = email;
    }
    private void validateName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("The name is required");
    }

    private void validateEmail(String email) {
        if (email == null || email.isBlank() || !email.contains("@")) throw new IllegalArgumentException("The email is invalid");
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", '" + name + "', email='" + email + "'}";
    }
}
