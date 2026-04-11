package com.danielpredel.javarecap.collections;

import com.danielpredel.javarecap.oop.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    // Shows how to sort objects and collections in Java.

    public void run() {
        System.out.println("\n=== Sorting ===");

        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Daniel", "daniel@mail.com"));
        users.add(new User(2L, "Tom", "tom@mail.com"));
        users.add(new User(3L, "Jerry", "jerry@mail.com"));
        users.add(new User(4L, "Billy", "billy@mail.com"));
        users.add(new User(5L, "Anabel", "anabel@mail.com"));
        users.add(new User(5L, "Mike", "mike@mail.com"));

        System.out.print("Original List:\t");
        for (User user: users){
            System.out.print(user.getName() + ", ");
        }

        System.out.print("\nSorted List:\t");
        users.sort(Comparator.comparing(User::getName));
        for (User user: users){
            System.out.print(user.getName() + ", ");
        }

        System.out.println();
    }
}
