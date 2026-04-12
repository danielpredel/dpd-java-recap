package com.danielpredel.javarecap.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImp implements UserService{

    // Concrete implementation of the UserService interface.

    private List<User> users = new ArrayList<>();
    private Long id = 1L;

    @Override
    public User createUser(String name, String email) {
        User user = new User(this.id++, name, email);
        this.users.add(user);
        return user;
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        users.removeIf(u -> u.getId().equals(id));
    }
}
