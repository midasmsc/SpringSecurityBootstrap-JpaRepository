package ru.kata.springBootSecuritydemo.service;

import ru.kata.springBootSecuritydemo.model.User;

import java.util.List;

public interface UserService {
    User findByName(String name);

    User getUser(Long id);

    List<User> getAllUsers();

    User addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

}
