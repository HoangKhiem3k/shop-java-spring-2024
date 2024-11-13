package com.project.shop_spring_2024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.shop_spring_2024.models.*;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPhoneNumber(String phoneNumber);
    Optional<User> findByPhoneNumber(String phoneNumber);
}