package com.westminster.class_practice.demo.productapi;

public class ServiceProduct extends Product implements Discountable{

    private int durationMinutes;
    private String serviceProvider;
    private boolean isOnline;
    private double discountedPrice;

    public ServiceProduct(int id, String name, int qty, boolean inStock, double unitPrice, int durationMinutes, String serviceProvider, boolean isOnline) {
        super(id, name, qty, inStock, unitPrice);
        this.durationMinutes = durationMinutes;
        this.serviceProvider = serviceProvider;
        this.isOnline = isOnline;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public boolean isOnline() {
        return isOnline;
    }

    @Override
   public String getSummary(){
        String mode = isOnline ? "Online" : "Offline";
        return "Service: " + getName()
                + " | " + durationMinutes + " minutes"
                + " | Provided by: " + serviceProvider
                + " | " + mode;
    }


}
