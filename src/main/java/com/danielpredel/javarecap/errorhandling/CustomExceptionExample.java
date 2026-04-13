package com.danielpredel.javarecap.errorhandling;

import com.danielpredel.javarecap.oop.User;
import com.danielpredel.javarecap.oop.UserService;
import com.danielpredel.javarecap.oop.UserServiceImpl;


public class CustomExceptionExample {

    //  Shows how to create a custom exception.

    public void run() {
        System.out.println("\n=== Custom Exception ===");

        UserService service = new UserServiceImpl();
        service.createUser("Billy", "billy@mail.com");
        service.createUser("Alan", "alan@mail.com");
        service.createUser("Mike", "mike@mail.com");

        try {
            User user = service.getUserById(10L)
                    .orElseThrow(() -> new UserNotFoundException("User Not Found"));

            user.introduce();
            user.showRole();

        } catch (UserNotFoundException e) {
            System.out.println("User Not Found");
        }
    }
}
