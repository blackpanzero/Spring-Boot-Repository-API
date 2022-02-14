package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;



//get all users
    public List<User> getAllUsers(){
        List<User> users= new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;

    }
    //get user by id
    public Optional<User>getUser(String id){
        return userRepository.findById(id);

    }
    public void addUser(User user){
        userRepository.save(user);
    }
    public void editUser(String id,User newuser){
        userRepository.save(newuser);

    }
    public void removeUser(String id){
       userRepository.deleteById(id);

    }
    public List<User> getUserByLocation(String id){
        List<User> users=new ArrayList<>();
        userRepository.findByLocationId(id).forEach(users::add);
        return users;

    }


}
