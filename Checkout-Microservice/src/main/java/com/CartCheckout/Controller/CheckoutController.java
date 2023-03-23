package com.CartCheckout.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CartCheckout.Model.CheckoutModel;
import com.CartCheckout.Service.CheckoutService;


@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("user")
public class CheckoutController {

		private CheckoutService checkoutservice;
		
		public CheckoutController(CheckoutService checkoutservice) {
			super();
			this.checkoutservice = checkoutservice;
		}
		
		@PostMapping("/addorder")
		public ResponseEntity<String> addcheckout(@RequestBody CheckoutModel checkoutmodel ) {
			
			return new ResponseEntity<String>(checkoutservice.addcheckout(checkoutmodel),HttpStatus.CREATED);
		}
		

		@GetMapping("/get/yourorders/{email}")
		public List<CheckoutModel> findbyemailcart(@PathVariable("email") String email){
			return checkoutservice.findbyemailcart(email);
		}
}
		