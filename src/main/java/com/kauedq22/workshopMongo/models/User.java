package com.kauedq22.workshopMongo.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Document
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "name")
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;
}
