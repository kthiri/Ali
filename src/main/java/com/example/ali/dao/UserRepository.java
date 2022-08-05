package com.example.ali.dao;

import com.example.ali.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    public User findUserByUsername(String username);
}
