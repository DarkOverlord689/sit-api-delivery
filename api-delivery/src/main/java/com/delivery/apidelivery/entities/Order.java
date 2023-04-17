package com.delivery.apidelivery.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private static int count = 0;
    private int id;
    private String customerName;
    private String customerEmail;
    private String status;
    private LocalDateTime crationTime;
    private LocalDateTime estimatedDeliveryTime;
    private List<Food> items;

    public Order(String customerName, String customerEmail, String status, LocalDateTime crationTime, LocalDateTime estimatedDeliveryTime, List<Food> items) {
        this.id = ++count;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.crationTime = crationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCrationTime() {
        return crationTime;
    }

    public void setCrationTime(LocalDateTime crationTime) {
        this.crationTime = crationTime;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public List<Food> getItems() {
        return items;
    }

    public void setItems(List<Food> items) {
        this.items = items;
    }
}
