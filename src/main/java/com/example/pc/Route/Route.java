package com.example.pc.Route;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Route {
    @Id
    private long id;

    private String username;
    private String email;
    private String password;
    private String role;

}
