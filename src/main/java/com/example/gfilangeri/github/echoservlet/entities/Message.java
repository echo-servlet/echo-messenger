package com.example.gfilangeri.github.echoservlet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long user;
    private String body;
    private Date date;

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public Long getUser() {
        return user;
    }

    public String getBody() {
        return body;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
