package com.westminster.class_practice.demo.productapi;

import com.fasterxml.jackson.annotation.JsonCreator;


public class Product {
    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double price;

    private static int instanceCount = 0;



    public Product(int id, String name, int qty, boolean inStock, double price){
        instanceCount++;
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.inStock = inStock;
        this.price = price;
    }

    @JsonCreator
    public Product() {
        this(0, null, 0, false, 0.0);
    }

    public double calculateTotal() {
        return this.qty * this.price;
    }


    public int getQty(){
        return this.qty;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean getInStock() {
        return this.inStock;
    }

    public double getPrice() {
        return this.price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String onFulfillOrder() {
        return "order fulfilled";
    }

    public String getSummary() {
        return name + " — £" + price;
    }

}
