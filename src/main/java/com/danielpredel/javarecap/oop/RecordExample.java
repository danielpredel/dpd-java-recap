package com.danielpredel.javarecap.oop;

public class RecordExample {

    // Shows how Java records can be used for simple immutable data models.

    public record UserDTO(String name, String email) {}

    public void run() {
        System.out.println("\n=== Records ===");
        UserDTO dto = new UserDTO("Jimmy", "slippin@jimmy.com");
        System.out.println(dto.name());
        System.out.println(dto.email());
    }
}
