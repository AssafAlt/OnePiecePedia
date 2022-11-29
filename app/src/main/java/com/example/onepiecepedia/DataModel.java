package com.example.onepiecepedia;

public class DataModel {

    String name;
    String role;
    int id_;
    int image;

    public DataModel(String name, String role, int id_, int image) {
        this.name = name;
        this.role = role;
        this.id_ = id_;
        this.image=image;
    }


    public String getName() {
        return name;
    }


    public String getRole() {
        return role;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
