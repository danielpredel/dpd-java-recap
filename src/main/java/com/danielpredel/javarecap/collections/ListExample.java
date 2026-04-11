package com.danielpredel.javarecap.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    // Shows how to use lists and basic operations in Java.

    public void run() {
        System.out.println("\n=== List ===");
        List<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Tom");
        names.add("Jerry");
        names.forEach(System.out::println);
    }
}
