package com.dungeon.model;

public class Product {
   private int id;
   private String name;
   private String  description ;
   private double weight;

    public Product(int id, String name, String description, double weight) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
