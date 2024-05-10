package io.github.andresgois.cleancode.infrastructure.gateways;

import io.github.andresgois.cleancode.application.gateways.UserGateway;
import io.github.andresgois.cleancode.domain.entity.User;
import io.github.andresgois.cleancode.infrastructure.persistence.UserEntity;
import io.github.andresgois.cleancode.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway{

    private final UserRepository userRepository;
    private final UserEntityMapper userMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User CreateUser(User userObj) {
        UserEntity userEntity = userMapper.toEntity(userObj);
        UserEntity entity = userRepository.save(userEntity);
        return userMapper.toDomain(entity);
    }


}
