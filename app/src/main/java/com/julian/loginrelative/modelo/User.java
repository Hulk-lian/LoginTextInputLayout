package com.julian.loginrelative.modelo;

public class User {
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        this.password = pwd;
    }

    public User(String username, String pwd) {

        this.username = username;
        this.password = pwd;
    }

    @Override
    public String toString() {
        return username +" "+password;

    }
}