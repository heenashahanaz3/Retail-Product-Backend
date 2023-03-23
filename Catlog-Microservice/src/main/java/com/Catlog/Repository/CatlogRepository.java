package com.Catlog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Catlog.Model.CatlogModel;

public interface CatlogRepository extends JpaRepository<CatlogModel, Long> {
	
	@Query(value = "SELECT * FROM products.productdetails where category = ?;", nativeQuery = true)
	List<CatlogModel> getProductDetailsByCategory(String category);
	
	@Query(value= "SELECT p.category,p.categoryimageurl FROM products.productdetails p group by p.category,p.categoryimageurl;", nativeQuery = true)
	List<String> getAllCategory();
}
