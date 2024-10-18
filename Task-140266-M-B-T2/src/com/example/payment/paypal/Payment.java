package com.example.payment;

import com.example.order.Order;

public class Payment {
    private Order order;
    private double amount;
    private PaymentProcessor paymentProcessor;

    public Payment(Order order, double amount, PaymentProcessor paymentProcessor) {
        this.order = order;
        this.amount = amount;
        this.paymentProcessor = paymentProcessor;
    }

    public void process() {
        paymentProcessor.processPayment(this);
    }

    public double getAmount() {
        return this.amount;
    }
}
