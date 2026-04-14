package com.danielpredel.javarecap.collections;

import java.util.Set;
import java.util.HashSet;

public class SetExample {

    // Shows how sets store unique values and avoid duplicates.

    public void run() {
        System.out.println("\n=== Set ===");
        Set<Long> ids = new HashSet<>();
        ids.add(1L);
        ids.add(1L);    // Ignored due to Set's nature of not allowing duplicates
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);
        ids.add(5L);
        ids.forEach(System.out::println);
    }
}
