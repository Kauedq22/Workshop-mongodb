package com.kauedq22.workshopMongo.dto;


import java.io.Serializable;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentDTO implements Serializable{
    private String text;
    private Date date;
    private AuthorDTO authorDTO;

    
    
}
