package com.sukowidodo.lakon.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sukowidodo.lakon.models.User;


public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByEmail(String email);
    
} 