package com.kauedq22.workshopMongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kauedq22.workshopMongo.models.Post;
import com.kauedq22.workshopMongo.repository.PostRepository;
import com.kauedq22.workshopMongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {
    
    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

  public List<Post> findByTitle(String text){
    return postRepository.searchTitle(text);
  }


}
