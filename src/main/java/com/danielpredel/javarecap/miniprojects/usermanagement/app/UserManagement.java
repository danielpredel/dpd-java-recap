package com.danielpredel.javarecap.miniprojects.usermanagement.app;

import com.danielpredel.javarecap.miniprojects.usermanagement.exception.EmailAlreadyInUseException;
import com.danielpredel.javarecap.miniprojects.usermanagement.exception.UserNotFoundException;
import com.danielpredel.javarecap.miniprojects.usermanagement.model.User;
import com.danielpredel.javarecap.miniprojects.usermanagement.repository.InMemoryUserRepository;
import com.danielpredel.javarecap.miniprojects.usermanagement.repository.UserRepository;
import com.danielpredel.javarecap.miniprojects.usermanagement.service.UserService;
import com.danielpredel.javarecap.miniprojects.usermanagement.service.UserServiceImpl;

public class UserManagement {

    public void run() {
        System.out.println("\n=== User Management Demo ===");

        UserRepository repo = new InMemoryUserRepository();
        UserService service = new UserServiceImpl(repo);

        // Create users
        System.out.println("\n-- Creating users --");
        User u1 = service.createUser("Daniel", "daniel@mail.com");
        User u2 = service.createUser("Ana", "ana@mail.com");
        System.out.println(u1);
        System.out.println(u2);

        // Duplicate email
        System.out.println("\n-- Duplicate email test --");
        try {
            service.createUser("Test", "daniel@mail.com");
        } catch (EmailAlreadyInUseException e) {
            System.out.println(e.getMessage());
        }

        // Find by id
        System.out.println("\n-- Find user by id --");
        service.findUserById(u1.getId())
                .ifPresent(System.out::println);

        // Find non-existing
        System.out.println("\n-- Find non-existing user --");
        System.out.println(service.findUserById(999L));

        // List all
        System.out.println("\n-- All users --");
        service.findAllUsers().forEach(System.out::println);

        // Update user
        System.out.println("\n-- Update user --");
        try {
            User updated = service.updateUser(u1.getId(), "Daniel Updated", "daniel2@mail.com");
            System.out.println(updated);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Update non-existing
        System.out.println("\n-- Update non-existing user --");
        try {
            service.updateUser(999L, "Ghost", "ghost@mail.com");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Delete user
        System.out.println("\n-- Delete user --");
        try {
            service.deleteUser(u2.getId());
            System.out.println("User deleted");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Delete non-existing
        System.out.println("\n-- Delete non-existing user --");
        try {
            service.deleteUser(999L);
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Final state
        System.out.println("\n-- Final users --");
        service.findAllUsers().forEach(System.out::println);
    }
}
