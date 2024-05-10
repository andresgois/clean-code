package io.github.andresgois.cleancode.application.gateways;

import io.github.andresgois.cleancode.domain.entity.User;

public interface UserGateway {

    User CreateUser(User user);

}
