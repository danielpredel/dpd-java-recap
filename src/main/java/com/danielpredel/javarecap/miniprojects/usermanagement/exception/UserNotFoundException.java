package com.danielpredel.javarecap.miniprojects.usermanagement.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String m) {
        super(m);
    }
}
