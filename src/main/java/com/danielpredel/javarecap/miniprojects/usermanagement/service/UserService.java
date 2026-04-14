package com.danielpredel.javarecap.miniprojects.usermanagement.service;

import com.danielpredel.javarecap.miniprojects.usermanagement.exception.EmailAlreadyInUseException;
import com.danielpredel.javarecap.miniprojects.usermanagement.exception.UserNotFoundException;
import com.danielpredel.javarecap.miniprojects.usermanagement.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(String name, String email) throws EmailAlreadyInUseException;
    Optional<User> findUserById(Long id);
    List<User> findAllUsers();
    User updateUser(Long id, String name, String email) throws EmailAlreadyInUseException, UserNotFoundException;
    void deleteUser(Long id) throws UserNotFoundException;
}
