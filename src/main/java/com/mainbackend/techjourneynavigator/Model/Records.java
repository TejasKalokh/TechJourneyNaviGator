package com.mainbackend.techjourneynavigator.Model;

import jakarta.persistence.*;

@Entity
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;
    public String Input;
    public String Output;
}
