package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService users;


    @RequestMapping(value = "/users")
    public List<User> getAllUser(){
        return users.getAllUsers();

    }

    @RequestMapping(value = "/users/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return users.getUser(id);

    }
    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        users.addUser(user);
    }
    @PutMapping(value = "/users/{id}")
    public void editUser(@RequestBody User user,@PathVariable String id){
        users.editUser(id,user);
    }
    @DeleteMapping(value = "/users/{id}")
    public void removeUser(@PathVariable String id){
        users.removeUser(id);

    }


}
