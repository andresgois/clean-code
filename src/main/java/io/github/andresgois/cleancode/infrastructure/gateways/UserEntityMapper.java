package io.github.andresgois.cleancode.infrastructure.gateways;

import io.github.andresgois.cleancode.domain.entity.User;
import io.github.andresgois.cleancode.infrastructure.persistence.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userObj){
        return new UserEntity(userObj.username(), userObj.password(), userObj.email());
    }

    User toDomain(UserEntity entity){
        return new User(entity.getUsername(), entity.getPassword(), entity.getEmail());
    }
    
}
