package com.aguilar.Bookkeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);
		Keeper obj = context.getBean(Keeper.class);

//		SpringApplication.run(BookkeepingApplication.class, args);
	}

}
//test master test