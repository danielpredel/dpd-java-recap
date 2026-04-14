package com.danielpredel.javarecap.miniprojects.usermanagement.repository;

import com.danielpredel.javarecap.miniprojects.usermanagement.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> update(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    boolean deleteById(Long id);
    boolean existsByEmail(String email);
    boolean existsById(Long id);
}
