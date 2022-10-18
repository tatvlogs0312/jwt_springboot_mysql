package com.example.jwtdbdemo.repository;

import com.example.jwtdbdemo.common.ERole;
import com.example.jwtdbdemo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    /**
     * Find role by name
     * @param name
     * @return Role
     */
    Optional<Role> findByName(ERole name);
}