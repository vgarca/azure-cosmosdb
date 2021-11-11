package com.swo.cosmos.service;

import com.swo.cosmos.model.User;
import com.swo.cosmos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    public Optional<User> getUser(String id) {
        return this.userRepository.findById(id);
    }
}
