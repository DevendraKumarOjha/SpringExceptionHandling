package com.dinfosoft.springexceptionhandling.repository;

import com.dinfosoft.springexceptionhandling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
