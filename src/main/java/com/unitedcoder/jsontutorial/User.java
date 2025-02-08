package com.unitedcoder.jsontutorial;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("Username")
    private String username;
    @JsonProperty("Password")
    private String password;
    @JsonProperty("Usertype")
    private String usertype;
   @JsonProperty("Age")
    private int age;
   @JsonProperty("Active")
    private boolean active;
    public User() {
    }

    public User(String username, String password, String usertype, int age, boolean active) {
        this.username = username;
        this.password = password;
        this.usertype = usertype;
        this.age = age;
        this.active = active;
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

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
