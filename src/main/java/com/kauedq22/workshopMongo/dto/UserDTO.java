package com.kauedq22.workshopMongo.dto;

import com.kauedq22.workshopMongo.models.User;

import lombok.Data;

@Data
public class UserDTO {
    private String id;
    private String name;
    private String email;
    
    public UserDTO(){

    }
    
    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }
}
