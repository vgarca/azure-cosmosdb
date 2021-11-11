package com.swo.cosmos.repository;

import com.swo.cosmos.model.User;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CosmosRepository<User, String> {
    User findByFirstName(String firstName);
    List<User> findAll();
    Optional<User> findById(String id);
}
