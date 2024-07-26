package com.kauedq22.workshopMongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kauedq22.workshopMongo.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


    
}
