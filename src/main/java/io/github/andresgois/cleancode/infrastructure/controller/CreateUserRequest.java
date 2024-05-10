package io.github.andresgois.cleancode.infrastructure.controller;

public record CreateUserRequest(
    String username,
    String password,
    String email
) {

}
