package com.swo.cosmos.repository;

import com.swo.cosmos.model.User;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CosmosRepository<User, String> {
    User findByFirstName(String firstName);
}
