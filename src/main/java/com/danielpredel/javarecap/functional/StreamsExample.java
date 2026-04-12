package com.danielpredel.javarecap.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    //  Shows how streams can process and transform collections.

    public void run() {
        System.out.println("\n=== Streams ===");
        exampleFilter();
        exampleMap();
        exampleSorted();
    }

    private void exampleFilter() {
        System.out.println("filter() + toList():");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 100; i += 3) {
            numbers.add(i);
        }
        System.out.println("Numbers: " + numbers);

        List<Integer> pairs = numbers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println("Pairs: " + pairs);
    }

    private void exampleMap() {
        System.out.println("\nmap() + collect():");
        List<String> lowerCaseNames = new ArrayList<>();
        lowerCaseNames.add("daniel");
        lowerCaseNames.add("tom");
        lowerCaseNames.add("jerry");
        lowerCaseNames.add("john");
        lowerCaseNames.add("anabel");
        System.out.println("Names: " + lowerCaseNames);

        List<String> upperCaseNames = lowerCaseNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Names: " + upperCaseNames);
    }

    private void exampleSorted() {
        System.out.println("\nsorted()");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-10);
        numbers.add(3);
        numbers.add(19);
        numbers.add(-21);
        numbers.add(7);
        numbers.add(1);
        System.out.println("Numbers: " + numbers);

        System.out.println("Sorted Numbers: " + numbers.stream().sorted().toList());
    }
}
