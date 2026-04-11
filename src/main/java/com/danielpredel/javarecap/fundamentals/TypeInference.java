package com.danielpredel.javarecap.fundamentals;

public class TypeInference {
    public void run() {
        System.out.println("\n=== Type Inference ===");
        exampleTypeInference();
    }

    private void exampleTypeInference() {
        var age = 23;
        var name = "Daniel";
        var pi = 3.14;
        var success = true;

        System.out.println("var age = " + age + ", type = " + getType(age));
        System.out.println("var name = " + name + ", type = " + getType(name));
        System.out.println("var pi = " + pi + ", type = " + getType(pi));
        System.out.println("var success = " + success + ", type = " + getType(success));
    }

    private String getType(Object obj) {
        return obj.getClass().getTypeName();
    }
}
