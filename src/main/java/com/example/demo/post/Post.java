package com.example.demo.post;

import com.example.demo.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Post {
    @Id
    private String id;
    private String postdate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String details;

    public Post() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Post(String id, String postdate, User user, String details) {
        this.id=id;
        this.postdate=postdate;
        this.user=user;
        this.details=details;
    }

    public String getId() {
        return id;
    }

    public String getPostdate() {
        return postdate;
    }


    public User getUser() {
        return user;
    }


    public String getDetails() {
        return details;
    }


}
