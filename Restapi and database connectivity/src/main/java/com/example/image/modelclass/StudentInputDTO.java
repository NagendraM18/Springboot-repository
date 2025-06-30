package com.example.image.modelclass;

import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class StudentInputDTO
{

    private String uucms;
    private String name;
    private String email;
    private String password;

    public String getImagename() {
        return imagename;
    }

    @Lob
    private byte[] image;
    private String imagename;

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public void setUucms(String uucms) {
        this.uucms = uucms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public byte[] getImage() {
        return image;
    }

    public String getUucms() {
        return uucms;
    }
}
