package com.Cart.Controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cart.Model.CartModel;
import com.Cart.Service.CartService;
import com.Cart.exception.ProductNotFoundException;


import java.io.IOException;

import java.net.*;
import java.io.*;


@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("user")
public class CartController {
	
	private CartService cartservice;
	
	public CartController(CartService cartservice) {
		super();
		this.cartservice = cartservice;
	}
	
	
	//saving data
	
	
	@GetMapping("/get/{email}")
	public String getUserRetailbyId(@PathVariable("email") String email){
		return cartservice.getbyemail(email);
	}
	
	@PutMapping("/addcart")
	public ResponseEntity<String> addcartbyUserId(@RequestBody CartModel cartmodel ) throws ProductNotFoundException{
		
		return new ResponseEntity<String>(cartservice.addcartbyUserIdAndproductId(cartmodel),HttpStatus.CREATED);
	}
	

	@GetMapping("/getcart/{email}")
	public List<String> getcart(@PathVariable("email") String email){
		String cart = cartservice.getbyemail(email);
		String[] pids = cart.split(",");
		List<String> products = new ArrayList<>();
		for (String pid : pids) {
			 try {
		            URL url = new URL("http://localhost:8084/productitems/get/"+pid);
		            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		            conn.setRequestMethod("GET");
		            conn.setConnectTimeout(5000);
		            conn.setReadTimeout(5000);

		            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		            String inputLine;
		            StringBuilder response = new StringBuilder();

		            while ((inputLine = in.readLine()) != null) {
		                response.append(inputLine);
		            }
		            in.close();
		            products.add(response.toString());
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}
		
		return products;
	}
	
	@PutMapping("/delproduct")
	public CartModel delpro(@RequestBody CartModel cart) throws ProductNotFoundException {
		return cartservice.delpro(cart);
	}
	
	@DeleteMapping("/delete/{email}")
	public String deletecart(@PathVariable("email") String email){
		try {
		cartservice.deletecart(email);
		return ("User Cart Deleted Successfully!.");
		}catch(Exception e) {
			return e.toString();
		}
	}
}

