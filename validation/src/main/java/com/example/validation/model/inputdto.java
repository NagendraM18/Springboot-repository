package com.example.validation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public class inputdto
{
    public inputdto(){

    }
    @Pattern(regexp ="^[a-zA-Z ]+",message = "invalid name")
    private String name;
    @Email(message = "invalid email")
    private String email;
    @Pattern(regexp = "^[a-zA-Z0-9@#$%^&*()_+!~/-]{8,}$",message = "set a strong password")
    private String  password;

    public String getName() {
        return name;
    }
//^(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*[0-9]+)(?=.*[\w]).{8,}
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
