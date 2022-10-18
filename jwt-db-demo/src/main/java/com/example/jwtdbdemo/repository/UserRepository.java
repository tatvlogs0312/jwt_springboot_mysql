package com.example.jwtdbdemo.repository;

import com.example.jwtdbdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Find user by username
     * @param username
     * @Return User
     */
    Optional<User> findByUsername(String username);

    /**
     * Check exist an user by username
     * @param username
     * @Return Boolean
     */
    Boolean existsByUsername(String username);

    /**
     * Check exist an user email
     * @param email
     * @Return Boolean
     */
    Boolean existsByEmail(String email);
}