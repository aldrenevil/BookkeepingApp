package com.aguilar.Bookkeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookkeepingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BookkeepingApplication.class, args);
		Keeper obj = context.getBean(Keeper.class);
		obj.hello();
		obj.clientGreet();
//		SpringApplication.run(BookkeepingApplication.class, args);
	}

}
