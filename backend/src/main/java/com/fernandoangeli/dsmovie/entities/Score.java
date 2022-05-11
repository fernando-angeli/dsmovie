package com.fernandoangeli.dsmovie.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_score")
public class Score {

    //Id composto
    @EmbeddedId
    private ScorePK id = new ScorePK();
    private Double value;

    public Score(){
    }

    public void setMovie(Movie movie){
        id.setMovie(movie);
    }

    public void setUser(User user){
        id.setUser(user);
    }
}
