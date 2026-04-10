package com.danielpredel.javarecap.fundamentals;

public class LoopsExample {

    // Shows the main looping structures used to repeat logic in Java.

    public void run() {
        System.out.println("\n=== Loops ===");
        exampleFor();
        exampleForEach();
    }

    private void exampleFor() {
        System.out.println("For Loop:");

        for (int i = 1; i < 6; i++) {
            System.out.println("*".repeat(i));
        }
    }

    private void exampleForEach() {
        System.out.println("\nFor Each Loop:");

        String[] students = {"Daniel", "Tom", "Lionel", "Cristiano"};

        for (String student: students){
            System.out.println(student + " attended class");
        }
    }
}
