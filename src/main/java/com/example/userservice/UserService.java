package com.example.userservice;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/**
 * Service layer for managing user accounts. Provides CRUD operations
 * backed by an in-memory store suitable for the demo project.
 */
@Service
public class UserService {

    private final Map<Long, User> store = new HashMap<>();
    private Long nextId = 1L;

    /**
     * Creates a new user and returns the persisted entity.
     */
    public User createUser(String name, String email) {
        User user = new User(nextId++, name, email);
        store.put(user.getId(), user);
        return user;
    }

    /**
     * Looks up a user by id.
     */
    public User getUser(Long id) {
        return store.get(id);
    }

    /**
     * Returns the total number of users currently registered.
     */
    public int count() {
        return store.size();
    }
}
