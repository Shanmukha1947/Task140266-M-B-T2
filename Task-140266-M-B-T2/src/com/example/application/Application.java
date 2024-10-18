package com.example.application;

import com.example.customer.Customer;
import com.example.order.Order;
import com.example.payment.Payment;
import com.example.payment.PaymentProcessor;
import com.example.payment.paypal.PayPalProcessor;

public class Application {
    public static <PaymentProcessor> void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@example.com");
        Order order = new Order(customer, "Product", 1);

        PaymentProcessor paymentProcessor = new PayPalProcessor(); // Select the desired payment processor
        Payment payment = new Payment(order, 100.0, paymentProcessor);
        payment.process(); // Output: Processing payment using PayPal: $100.0
    }
}
