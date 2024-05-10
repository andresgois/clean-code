package io.github.andresgois.cleancode.application.usecases;

import io.github.andresgois.cleancode.application.gateways.UserGateway;
import io.github.andresgois.cleancode.domain.entity.User;

public class CreateUserInterector {

    private UserGateway userGateway;
    
    public CreateUserInterector(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User CreateUser(User user){
        return userGateway.CreateUser(user);
    }
}
