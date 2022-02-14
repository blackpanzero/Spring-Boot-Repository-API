package com.example.demo.user;

import com.example.demo.location.Location;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {
    @Id
    private String id;
    private String first_name;
    private String second_name;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    private String email;

    public User() {
    }

    public User(String id, String first_name, String second_name, Location location, String email) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.location = location;
        this.email=email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }
}


