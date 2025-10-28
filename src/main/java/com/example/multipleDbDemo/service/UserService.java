package com.example.multipleDbDemo.service;

import com.example.multipleDbDemo.entity.primary.User;
import com.example.multipleDbDemo.repository.primary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
    UserRepository userRepository;

public void saveUser(User user) {
    userRepository.save(user);
}
public List<User> getAllUsers() {
    return userRepository.findAll();
}

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public String updateUser(Long id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            userRepository.save(user);
            return "User updated successfully";
        }).orElse("User not found");
    }
}
