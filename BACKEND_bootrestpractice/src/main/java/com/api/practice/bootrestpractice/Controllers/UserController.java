package com.api.practice.bootrestpractice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.api.practice.bootrestpractice.Entity.User;
import com.api.practice.bootrestpractice.services.UserService;

@RestController
public class UserController 
{
     @Autowired
     private UserService UserService;
     
     @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/users")
    public ResponseEntity <List<User>> getUsers()
    {
       List<User> list=UserService.getAllUsers();
       if(list.size()<=0)
       {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
       return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserId(@PathVariable("id") int id)
    {
        User User=UserService.getUserById(id);
        if(User==null)
        {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();            
        }
        return ResponseEntity.of(Optional.of(User));
    }
    @PostMapping("/users")
    public User addUser(@RequestBody User b)
    {
        this.UserService.addUser(b);
        return b;
    }
}
