package com.aguilar.Bookkeeping;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class Payment implements PaymentMethod {
    private double amount;
    private Date date;
    private boolean isSuccessful;
    private String paymentMethod;
    private final Subscription subscription;
    public static final String GCASH = "GCASH";
    public static final String CASH = "CASH";

    public Payment(double amount, Date date, Subscription subscription) {
        this.amount = amount;
        this.date = date;
        this.subscription=subscription;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public Subscription getSubscription() {
        return subscription;
    }



    @Autowired
    public Payment(Subscription subscription){
        this.subscription =  subscription;
    }

    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod.equals(GCASH) || paymentMethod.equals(CASH)) {
            this.paymentMethod = paymentMethod;
        } else {
            throw new IllegalArgumentException("Invalid payment method");
        }
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

}
