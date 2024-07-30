package com.kauedq22.workshopMongo.dto;

import java.io.Serializable;

import com.kauedq22.workshopMongo.models.User;

import lombok.Data;

@Data
public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO() {
	}

	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}
}
