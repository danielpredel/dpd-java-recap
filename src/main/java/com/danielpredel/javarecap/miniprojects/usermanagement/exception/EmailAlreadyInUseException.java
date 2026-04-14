package com.danielpredel.javarecap.miniprojects.usermanagement.exception;

public class EmailAlreadyInUseException extends RuntimeException {
    public EmailAlreadyInUseException(String m) {
        super(m);
    }
}
