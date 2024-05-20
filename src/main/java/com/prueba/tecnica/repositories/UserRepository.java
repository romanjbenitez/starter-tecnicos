package com.prueba.tecnica.repositories;

import java.util.Optional;

import com.prueba.tecnica.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);
}