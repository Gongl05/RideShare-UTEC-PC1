package com.example.pc.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class User {
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
    private String Role;
}
