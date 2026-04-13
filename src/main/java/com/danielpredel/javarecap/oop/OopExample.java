package com.danielpredel.javarecap.oop;

import java.util.List;
import java.util.Optional;

public class OopExample {
    public void run() {
        System.out.println("\n=== OOP ===");
        UserService service = new UserServiceImpl();
        service.createUser("Daniel", "daniel@mail.com");
        service.createUser("Tom", "tom@mail.com");
        service.createUser("Jerry", "jerry@mail.com");
        List<User> users = service.getAllUsers();
        ((List<?>) users).forEach(System.out::println);
        Optional<User> userOpt = service.getUserById(2L);
        userOpt.ifPresent(Person::introduce);
        userOpt.ifPresent(User::showRole);
    }
}
