package net.javacode.springsecurityapp.service;

import net.javacode.springsecurityapp.model.User;

/**
 * Service class for {@link net.javacode.springsecurityapp.model.User}
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
