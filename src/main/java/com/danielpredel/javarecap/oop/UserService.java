package com.danielpredel.javarecap.oop;

import java.util.List;
import java.util.Optional;

public interface UserService {

    // Interface used to define a simple service contract.

    User createUser(String name, String email);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
