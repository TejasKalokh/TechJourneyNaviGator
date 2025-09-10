package com.mainbackend.techjourneynavigator.Model;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class UserDetails {
    @jakarta.persistence.Id
    private String id;
    private String password;
    private String email;
    private String username;
}
