
package com.test.SpringCRUDH2memory.controller;


import com.test.SpringCRUDH2memory.entity.User;
import com.test.SpringCRUDH2memory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.createOrUpdateUser(user);
    }

    @GetMapping("/user")
    public List<User> getUser() {
        return userService.getAllUser();
    }

    @PostMapping("/users")
    public List<User> addUsers(@RequestBody List<User> users) {
        return userService.createUsers(users);
    }

    @GetMapping("/user/{id}")
    public User getUseById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userService.createOrUpdateUser(user);
    }

    @DeleteMapping("/user")
    public String deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }
}



