package com.fernandoangeli.dsmovie.dto;

import com.fernandoangeli.dsmovie.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String email;

    public UserDTO(){
    }

    public UserDTO(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public UserDTO(User user) {
        id = user.getId();
        email = user.getEmail();
    }
}
