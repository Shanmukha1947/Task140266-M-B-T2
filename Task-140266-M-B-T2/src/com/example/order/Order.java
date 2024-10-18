package com.example.order;

import com.example.customer.Customer;

public class Order {
    private Customer customer;
    private String item;
    private int quantity;

    public Order(Customer customer, String item, int quantity) {
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    // getters and setters
}
