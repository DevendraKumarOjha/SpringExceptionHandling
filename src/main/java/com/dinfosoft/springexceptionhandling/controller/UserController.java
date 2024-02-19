package com.dinfosoft.springexceptionhandling.controller;

import com.dinfosoft.springexceptionhandling.dto.UserRequestDto;
import com.dinfosoft.springexceptionhandling.entity.User;
import com.dinfosoft.springexceptionhandling.exception.UserNotFoundException;
import com.dinfosoft.springexceptionhandling.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUserDetails(@RequestBody @Valid UserRequestDto request) {

        return new ResponseEntity<>(service.saveUserDetails(request), HttpStatus.CREATED);
    }

    @GetMapping("/fetchallusers")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(service.getALlUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) throws UserNotFoundException {

        return ResponseEntity.ok(service.getUserById(id));
    }

}
