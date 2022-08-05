package com.example.ali.controller;

import com.example.ali.dao.UserRepository;
import com.example.ali.entity.User;
import com.example.ali.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){
        return  userRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody User user){
        userRepository.save(user);
    }

    @PostMapping("login")
    public User Login(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password)
    {
        return userService.Login(username,password);
    }



}
