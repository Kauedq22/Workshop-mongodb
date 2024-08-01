package com.kauedq22.workshopMongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kauedq22.workshopMongo.models.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
   
    List<Post> findByTitleContainingIgnoreCase(String text);

}
