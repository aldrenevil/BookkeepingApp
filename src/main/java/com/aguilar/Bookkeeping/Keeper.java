package com.aguilar.Bookkeeping;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@RestController
@Component
public class Keeper implements Employee {
    private final Client client;

    @Autowired
    public Keeper(Client client){
        this.client = client;
    }
//    @RequestMapping("/")
@Override
public void hello(){
        System.out.println("Hello Keeper");    }

    public void clientGreet(){
        client.hello();
    }
}
