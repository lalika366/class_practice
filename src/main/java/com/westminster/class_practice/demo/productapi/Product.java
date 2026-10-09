package com.westminster.class_practice.demo.productapi;

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

    public boolean getinStock() {
        return this.inStock;
    }

    public double getprice() {
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

    public void setUnitPrice(double price) {
        this.price = price;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

}
