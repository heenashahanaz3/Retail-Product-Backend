package com.AdminProducts.service;

import org.springframework.stereotype.Service;

import com.AdminProducts.model.AdminProductsModel;
import com.AdminProducts.repository.AdminProductsRepository;

@Service
public class AdminProductsServiceImpl implements AdminProductsService{

	private AdminProductsRepository productrepository;

	public AdminProductsServiceImpl(AdminProductsRepository productrepository) {
		super();
		this.productrepository=productrepository;
	}
	@Override
	public String addAdminProduct(AdminProductsModel product) {
		// TODO Auto-generated method stub
		productrepository.save(product);
		return "Product with id "+product.getId()+" added successfully";
	}


}
