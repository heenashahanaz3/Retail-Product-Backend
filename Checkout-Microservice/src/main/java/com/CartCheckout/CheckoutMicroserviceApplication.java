package com.CartCheckout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckoutMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckoutMicroserviceApplication.class, args);
		System.out.println("Checkout");
	}

}
