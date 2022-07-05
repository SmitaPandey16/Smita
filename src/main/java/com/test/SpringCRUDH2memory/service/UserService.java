package com.test.SpringCRUDH2memory.service;

import com.test.SpringCRUDH2memory.dao.UserRepository;
import com.test.SpringCRUDH2memory.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public List<User> createUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public User getUserById(int id) {
        User unknown = new User();
        unknown.setName("unkonwn user");
        unknown.setAddress("unknown address");
        return userRepository.findById(id).orElse(unknown);
    }

    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return "User got deleted";
    }

    public String deleteUser(User user) {
        userRepository.delete(user);
        return "User got deleted";
    }
}
