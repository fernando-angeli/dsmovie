package com.fernandoangeli.dsmovie.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreDTO {

    private Long movie_id;
    private String email;
    private Double score;

    public ScoreDTO(){
    }

}
