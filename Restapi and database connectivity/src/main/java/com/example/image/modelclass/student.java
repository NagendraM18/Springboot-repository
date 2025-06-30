package com.example.image.modelclass;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slno;
    private String uucms;
    private String name;
    private String email;
    private String password;
    private String imagename;
    @Lob
    private byte[] image;

}