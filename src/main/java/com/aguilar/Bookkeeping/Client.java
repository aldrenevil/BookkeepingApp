package com.aguilar.Bookkeeping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Client {
    private String name;
    private List<Payment> payments;
    private Subscription subscription;

    @Autowired
    public Client(Subscription subscription){
        this.subscription=subscription;
    }
    public Subscription getSubscription() {
        return subscription;
    }
    // Add payment to the list
    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    // List all payment methods used
    public List<String> listPaymentMethods() {
        List<String> paymentMethods = new ArrayList<>();
        for (Payment payment : payments) {
            paymentMethods.add(payment.getPaymentMethod()); // Collect payment methods
        }
        return paymentMethods;
    }

}
