package com.Cart.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.Cart.Model.CartModel;

public interface CartRepository extends JpaRepository<CartModel, String>{

	@Query(value = "SELECT * FROM products.cart where email = ?;", nativeQuery = true)
	public String checkcart(String email);
	
	@Query(value = "SELECT cart FROM products.cart where email = ?;", nativeQuery = true)
	public String getcartbyemail(String email);
}
