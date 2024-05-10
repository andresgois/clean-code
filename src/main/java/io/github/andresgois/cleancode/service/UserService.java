package io.github.andresgois.cleancode.service;

import org.springframework.stereotype.Service;

import io.github.andresgois.cleancode.model.User;
import io.github.andresgois.cleancode.repository.UserRepository;

@Service
public class UserService {

    private UserRepository  userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }
    
}
