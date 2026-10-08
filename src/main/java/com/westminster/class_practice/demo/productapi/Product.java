package com.westminster.class_practice.demo.productapi;

public class Product {
    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double price;

    public Product(int id, String name, int qty, boolean inStock, double price){
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.inStock = inStock;
        this.price = price;
    }

    public double calculateTotal(){
    return calculateTotal();
    }

    public int getQty(){
        return qty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getinStock() {
        return inStock;
    }

    public double getprice() {
        return price;
    }

}
