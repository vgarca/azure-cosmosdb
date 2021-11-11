package com.swo.cosmos.azurecosmosdb;

import com.swo.cosmos.model.User;
import com.azure.cosmos.models.PartitionKey;
import com.swo.cosmos.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class AzureCosmosdbApplicationTests {

    @Autowired
    private UserRepository repository;

    @Test
    void findUserTest() {
        User testUser = new User("1", "Lola", "Perez", "Avenida Nocedo");

        repository.save(testUser);
        Optional<User> retrievedUser = repository.findById("1", new PartitionKey("Perez"));

        Assertions.assertNotNull(retrievedUser, "Retrieved User is Null");
    }

}
