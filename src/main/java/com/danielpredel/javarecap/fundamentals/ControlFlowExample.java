package com.danielpredel.javarecap.fundamentals;

public class ControlFlowExample {

    //  Shows how conditionals work in Java for basic decision-making.

    public void run() {
        System.out.println("\n=== Control Flow ===");
        exampleIf();
        exampleSwitch();
    }

    private void exampleIf() {
        System.out.println("If Statement:");
        int age = 23;

        if (age > 17){
            System.out.println("Since your age is " + age + ", you are an adult");
        }
    }

    private void exampleSwitch() {
        System.out.println("\nSwitch Statement:");
        int day = 1;

        String dayString = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Other";
        };

        System.out.println("The day " + day + " of the week is " + dayString);
    }
}
