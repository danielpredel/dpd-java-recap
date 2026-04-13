package com.danielpredel.javarecap.errorhandling;

public class ExceptionExample {

    //  Shows how try-catch is used for handling exceptions.

    public void run() {
        System.out.println("\n=== Exceptions ===");
        exampleTryCatch();
        exampleMultiCatch();
        exampleFinally();
    }

    private void exampleTryCatch() {
        System.out.println("Try-Catch:");

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        }
    }

    private void exampleMultiCatch() {
        System.out.println("\nMultiple Catch:");

        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Null Values");
        } catch (Exception e) {
            System.out.println("General Error");
        }
    }

    private void exampleFinally() {
        System.out.println("\nFinally:");

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("Finally");
        }

    }
}
