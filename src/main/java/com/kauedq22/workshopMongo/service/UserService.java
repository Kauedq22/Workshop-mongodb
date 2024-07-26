package com.kauedq22.workshopMongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kauedq22.workshopMongo.dto.UserDTO;
import com.kauedq22.workshopMongo.models.User;
import com.kauedq22.workshopMongo.repository.UserRepository;
import com.kauedq22.workshopMongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
    
    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
