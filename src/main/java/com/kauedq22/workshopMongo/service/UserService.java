package com.kauedq22.workshopMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kauedq22.workshopMongo.models.User;
import com.kauedq22.workshopMongo.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
