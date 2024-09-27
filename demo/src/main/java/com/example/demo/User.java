package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Post> posts;


    public User(List<Post> posts) {
        this.posts = posts;
    }

    public User(String userName, List<Post> posts) {
        this.userName = userName;
        this.posts = posts;
    }

    public String getUserName() {
        return userName;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
