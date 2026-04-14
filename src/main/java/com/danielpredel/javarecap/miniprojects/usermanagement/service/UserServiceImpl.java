package com.danielpredel.javarecap.miniprojects.usermanagement.service;

import com.danielpredel.javarecap.miniprojects.usermanagement.exception.EmailAlreadyInUseException;
import com.danielpredel.javarecap.miniprojects.usermanagement.exception.UserNotFoundException;
import com.danielpredel.javarecap.miniprojects.usermanagement.model.User;
import com.danielpredel.javarecap.miniprojects.usermanagement.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User createUser(String name, String email) throws EmailAlreadyInUseException {
        if (repository.existsByEmail(email)) {
            throw new EmailAlreadyInUseException("Email Already in Use");
        }
        User user = new User(name, email);
        return repository.save(user);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User updateUser(Long id, String name, String email) throws EmailAlreadyInUseException, UserNotFoundException {
        if (repository.existsByEmail(email)) throw new EmailAlreadyInUseException("Email Already in Use");
        User user = new User(id, name, email);
        return repository.update(user).orElseThrow(() -> new UserNotFoundException("User Not Found"));
    }

    @Override
    public void deleteUser(Long id) throws UserNotFoundException {
        if (!repository.deleteById(id)) throw new UserNotFoundException("User Not Found");
    }
}
