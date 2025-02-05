package com.kauedq22.workshopMongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.kauedq22.workshopMongo.dto.AuthorDTO;
import com.kauedq22.workshopMongo.dto.CommentDTO;
import com.kauedq22.workshopMongo.models.Post;
import com.kauedq22.workshopMongo.models.User;
import com.kauedq22.workshopMongo.repository.PostRepository;
import com.kauedq22.workshopMongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;


    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        userRepository.deleteAll();
        postRepository.deleteAll();

        User mano = new User(null, "Mano Brown", "mano@gmail.com");
        User charlie = new User(null, "Charlie Green", "green@gmail.com");
        User bob = new User(null, "Bob Marley", "bob420@gmail.com");

        userRepository.saveAll(Arrays.asList(mano, charlie, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2024"), "Bora Brasil", "Amanha nas olimpiadas o brasil vai ganhar", new AuthorDTO(mano));
		Post post2 = new Post(null, sdf.parse("23/03/2016"), "Que dia Terrivel", "Atroplei meu avo", new AuthorDTO( bob));

        CommentDTO c1 = new CommentDTO("Dale Brasil", sdf.parse("21/03/2024"), new AuthorDTO(charlie));
        CommentDTO c2 = new CommentDTO("Perdemo...", sdf.parse("22/03/2024"), new AuthorDTO(bob));
        CommentDTO c3 = new CommentDTO("Ainda bem que tem outro", sdf.parse("22/03/2017"), new AuthorDTO(charlie));
        
        post1.getComments().addAll(Arrays.asList(c1,c2));
        post2.getComments().addAll(Arrays.asList(c3));

        postRepository.saveAll(Arrays.asList(post1, post2));

        mano.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(mano);
    }
    
}
