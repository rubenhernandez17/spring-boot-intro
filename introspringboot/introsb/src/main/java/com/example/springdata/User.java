package com.example.springdata;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;

@EntityScan
public class User {
 
    /**
     *
     */
    @Id
    @Generated(date = "2023-04-22", comments = "Comment", value = {})
    private Long id;
 
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    private String name;
 
    private String email;
 
    public User() {
    }
 
   
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
}
