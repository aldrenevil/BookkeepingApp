package com.aguilar.Bookkeeping;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@RestController
@Component
public class Keeper implements Employee {
    private final Client client;

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return "";
    }
    @Autowired
    public Keeper(Client client){
        this.client = client;
    }

}
