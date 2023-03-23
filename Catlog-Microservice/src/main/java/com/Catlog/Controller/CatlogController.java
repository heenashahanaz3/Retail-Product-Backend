package com.Catlog.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Catlog.Model.CatlogModel;
import com.Catlog.Service.CatlogService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/catlog")
public class CatlogController {
	
	private CatlogService catlogservice;
	
	public CatlogController(CatlogService catlogservice) {
		super();
		this.catlogservice = catlogservice;
	}
	
	@GetMapping("/get/{category}")
	public List<CatlogModel> getProductDetailsByCategory(@PathVariable("category") String category){
		
		return catlogservice.getProductDetailsByCategory(category);
	}
	
	@GetMapping("/get")
	public List<String> getAllCategory(){
		return catlogservice.getAllCategory();
	}
	

}
