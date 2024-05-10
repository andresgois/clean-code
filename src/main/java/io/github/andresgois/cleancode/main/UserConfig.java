package io.github.andresgois.cleancode.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.andresgois.cleancode.application.gateways.UserGateway;
import io.github.andresgois.cleancode.application.usecases.CreateUserInterector;
import io.github.andresgois.cleancode.infrastructure.controller.UserDTOMapper;
import io.github.andresgois.cleancode.infrastructure.gateways.UserEntityMapper;
import io.github.andresgois.cleancode.infrastructure.gateways.UserRepositoryGateway;
import io.github.andresgois.cleancode.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInterector createUserCase(UserGateway userGateway){
        return new CreateUserInterector(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }
    
    @Bean 
    UserEntityMapper entityMapper(){
        return new UserEntityMapper();
    }

    @Bean 
    UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }

    @Bean 
    UserDTOMapper userDTOMapper(){
        return new UserDTOMapper();
    }
}
