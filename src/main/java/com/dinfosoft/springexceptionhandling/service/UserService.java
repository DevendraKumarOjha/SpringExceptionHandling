package com.dinfosoft.springexceptionhandling.service;

import com.dinfosoft.springexceptionhandling.dto.UserRequestDto;
import com.dinfosoft.springexceptionhandling.entity.User;
import com.dinfosoft.springexceptionhandling.exception.UserNotFoundException;
import com.dinfosoft.springexceptionhandling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User saveUserDetails(UserRequestDto request) {

        User user = User.build(0, request.getName(),
                request.getEmail(), request.getMobile(), request.getGender(),
                request.getAge(), request.getNationality());
        return userRepository.save(user);
    }

    public List<User> getALlUsers() {

        return userRepository.findAll();
    }

    public User getUserById(int id) throws UserNotFoundException {

        User user = userRepository.findByUserId(id);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException("User not found for the userId " + id);
        }

    }

}
