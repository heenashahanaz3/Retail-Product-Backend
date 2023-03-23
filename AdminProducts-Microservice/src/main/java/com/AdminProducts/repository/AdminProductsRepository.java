package com.AdminProducts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.AdminProducts.model.AdminProductsModel;


public interface AdminProductsRepository extends JpaRepository<AdminProductsModel, Integer> {
	


}
