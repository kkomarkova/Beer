package com.example.beer;

import java.io.Serializable;

//This class includes the parameters of the beer
public class Beer implements Serializable {
    private int id;
    private String name;
    private double abv; // alcohol by volume

    public Beer() {
    }

    public Beer(int id, String name, double abv) {
        this.id = id;
        this.name = name;
        this.abv = abv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + abv;
    }
}
