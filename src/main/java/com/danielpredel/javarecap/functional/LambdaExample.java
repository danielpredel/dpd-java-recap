package com.danielpredel.javarecap.functional;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    // Shows how lambda expressions work for shorter code.

    public void run() {
        System.out.println("\n=== Lambdas ===");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        System.out.print("Numbers: \t");
        numbers.forEach(x -> System.out.print((x) + ", "));
        System.out.println();
        System.out.print("Squares: \t");
        numbers.forEach(x -> System.out.print((x * x) + ", "));
        System.out.println();
        System.out.print("Cubes: \t\t");
        numbers.forEach(x -> System.out.print((x * x * x) + ", "));
        System.out.println();
    }
}
