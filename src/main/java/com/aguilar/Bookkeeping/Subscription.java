package com.aguilar.Bookkeeping;

import org.springframework.stereotype.Component;

@Component
public class Subscription {

    private int plan;

    public int getPlan() {
        return plan;
    }
    public void setPlan(int plan) {
        this.plan = plan;
    }

    public Subscription(){
    }



}
