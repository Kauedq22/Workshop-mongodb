package com.kauedq22.workshopMongo.models;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Document
@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Post implements Serializable {
    @Id
	private String id;
	private Date date;
	private String title;
	private String body;
	private User author;
}
