package com.dungeon.model;

public class Waiter {
    private int id;
    private String name;
    private String lastName;
    private int phone;

    public Waiter(int id, String name, String lastName, int phone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
