package com.danielpredel.javarecap.functional;

import com.danielpredel.javarecap.oop.User;
import com.danielpredel.javarecap.oop.UserService;
import com.danielpredel.javarecap.oop.UserServiceImp;

import java.util.Optional;

public class OptionalExample {

    //  Shows how Optional is used to handle missing values.

    public void run() {
        System.out.println("\n=== Optional ===");

        UserService service = new UserServiceImp();
        service.createUser("Daniel", "daniel@mail.com");
        service.createUser("Tom", "tom@mail.com");
        service.createUser("Jerry", "jerry@mail.com");

        Optional<User> userOpt = service.getUserById(3L);

        System.out.println("ifPresent():");
        userOpt.ifPresent(u -> System.out.println(u.getName()));

        System.out.println("\norElse();");
        Optional<User> userOptTwo = service.getUserById(10L);
        User userTwo = userOptTwo.orElse(new User(10L, "Default", "def@ult.com"));
        System.out.println("UserTwo: " + userTwo.getName());
    }
}
