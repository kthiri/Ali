package com.example.ali.service;

import com.example.ali.dao.UserRepository;
import com.example.ali.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User Login(String userName, String password){

        User user=userRepository.findUserByUsername(userName);
        if(user.getPassaword().equals(password)){
            return user;
        }
        else {
            return null;
        }
    }
}
