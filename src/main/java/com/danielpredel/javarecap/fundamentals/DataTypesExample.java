package com.danielpredel.javarecap.fundamentals;

public class DataTypesExample {

    //  Shows the basic primitive and object data types available in Java.

    public void run() {
        System.out.println("=== Data Types ===");
        examplePrimitives();
        exampleObjects();
    }

    private void examplePrimitives(){
        System.out.println("Primitive Data Types:");

        int age = 25;
        System.out.println("age = " + age);

        long bigNumber = 123456789012345L;
        System.out.println("bigNumber = " + bigNumber);

        float pi = 3.141592f;
        System.out.println("pi = " + pi);

        double piDouble = 3.14159265358979;
        System.out.println("piDouble = " + piDouble);

        boolean success = true;
        System.out.println("success = " + success);

        char letter = 'c';
        System.out.println("letter = " + letter);
    }

    private void exampleObjects(){
        System.out.println("\nObject Data Types:");

        String name = "Daniel";
        System.out.println("name = " + name + ", name.length() = " + name.length());

        System.out.println("Integer.valueOf(\"24680\") = " + Integer.valueOf("24680") + ", Integer.parseInt(\"13579\"); = " + Integer.parseInt("13579"));

        String[] technologies = {"Java", "Docker", "AWS", "Linux", "Kubernetes"};
        System.out.println("technologies[0] = " + technologies[0] + ", technologies.length = " + technologies.length);
    }
}
