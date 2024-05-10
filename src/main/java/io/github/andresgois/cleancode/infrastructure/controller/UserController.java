package io.github.andresgois.cleancode.infrastructure.controller;

import org.springframework.web.bind.annotation.RestController;

import io.github.andresgois.cleancode.application.usecases.CreateUserInterector;
import io.github.andresgois.cleancode.domain.entity.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("users")
public class UserController {

    private final CreateUserInterector createUserInterector;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInterector createUserInterector) {
        this.createUserInterector = createUserInterector;
        this.userDTOMapper = new UserDTOMapper();
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest entity) {
        User userBusinessOjb = userDTOMapper.toUser(entity);     
        User user = createUserInterector.CreateUser(userBusinessOjb);
        return userDTOMapper.toResponse(user);
    }
    
}
