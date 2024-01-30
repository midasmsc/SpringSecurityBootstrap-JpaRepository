package ru.kata.springBootSecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.springBootSecuritydemo.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
