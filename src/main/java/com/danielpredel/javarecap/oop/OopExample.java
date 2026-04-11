package com.danielpredel.javarecap.oop;

import java.util.List;

public class OopExample {
    public void run() {
        System.out.println("\n=== OOP ===");
        UserService service = new UserServiceImp();
        service.createUser("Daniel", "daniel@mail.com");
        service.createUser("Tom", "tom@mail.com");
        service.createUser("Jerry", "jerry@mail.com");
        List<User> users = service.getAllUsers();
        ((List<?>) users).forEach(System.out::println);
        User user = service.getUserById(2L);
        if (user != null) {
            user.introduce();
            user.showRole();
        }
    }
}
