package ru.kata.springBootSecuritydemo.service;

import ru.kata.springBootSecuritydemo.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
}
