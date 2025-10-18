package com.example.multipleDbDemo.controller;

import com.example.multipleDbDemo.entity.primary.User;
import com.example.multipleDbDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok("user added successfully");
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers() {

        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
