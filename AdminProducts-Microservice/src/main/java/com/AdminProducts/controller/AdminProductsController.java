package com.AdminProducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdminProducts.model.AdminProductsModel;
import com.AdminProducts.service.AdminProductsService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/productitems")

public class AdminProductsController  {
	
	@Autowired
	AdminProductsService productservice;
	
	@PostMapping("/addproducts")
	public ResponseEntity<String> addAdminProduct(@RequestBody AdminProductsModel product) {
		String result = productservice.addAdminProduct(product);
		ResponseEntity<String> res= new ResponseEntity<>(result,HttpStatus.CREATED);
		return res;
	}
	
	

}
