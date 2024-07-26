package com.kauedq22.workshopMongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.kauedq22.workshopMongo.models.User;
import com.kauedq22.workshopMongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll(); 

        User maria = new User(null, "Mano Brown", "mano@gmail.com");
        User alex = new User(null, "Charlie Green", "green@gmail.com");
        User bob = new User(null, "Bob Marley", "bob420@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
    
}
