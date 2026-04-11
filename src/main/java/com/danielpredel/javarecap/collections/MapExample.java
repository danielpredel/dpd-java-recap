package com.danielpredel.javarecap.collections;

import java.util.Map;
import java.util.HashMap;

public class MapExample {

    // Shows how key-value pairs work using maps in Java.

    public void run() {
        System.out.println("\n=== Map ===");
        Map<String, Integer> people = new HashMap<>();
        people.put("Daniel", 23);
        people.put("Tom", 41);
        people.put("Jerry", 30);
        people.put("John", 26);
        people.put("Anabel", 20);
        people.put("Billy", 28);
        System.out.println(people);
    }
}
