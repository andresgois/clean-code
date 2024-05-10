package io.github.andresgois.cleancode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.andresgois.cleancode.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
