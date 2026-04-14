package com.danielpredel.javarecap.miniprojects.usermanagement.repository;

import com.danielpredel.javarecap.miniprojects.usermanagement.model.User;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {
    private final Map<Long, User> users = new HashMap<>();
    private Long id = 1L;

    @Override
    public User save(User user) {
        User newUser = new User(id++, user.getName(), user.getEmail());
        users.put(newUser.getId(), newUser);
        return newUser;
    }

    @Override
    public Optional<User> update(User user) {
        if (!users.containsKey(user.getId())) {
            return Optional.empty();
        }
        else {
            users.put(user.getId(), user);
            return Optional.of(user);
        }
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return users.values().stream().toList();
    }

    @Override
    public boolean deleteById(Long id) {
        return users.remove(id) != null;
    }

    @Override
    public boolean existsByEmail(String email) {
        return users.values().stream()
                .anyMatch(u -> u.getEmail().equals(email));
    }

    @Override
    public boolean existsById(Long id) {
            return users.containsKey(id);
    }
}
