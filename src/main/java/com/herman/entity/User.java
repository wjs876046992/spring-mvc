package com.herman.entity;

import java.util.Date;

/**
 * Created by asus on 2017/4/8.
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Date crateTime;

    public User() {
    }

    public User(Integer id, String username, String password, Date crateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.crateTime = crateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }
}
