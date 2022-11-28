package com.dungeon.model;

import javax.xml.crypto.Data;

public class Menu {
 private Product product;
private double price;
private Data timeToCook;

    public Menu(Product product, double price, Data timeToCook) {
        this.product = product;
        this.price = price;
        this.timeToCook = timeToCook;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Data getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(Data timeToCook) {
        this.timeToCook = timeToCook;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "product=" + product +
                ", price=" + price +
                ", timeToCook=" + timeToCook +
                '}';
    }
}
