package com.CartCheckout.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CartCheckout.Model.CheckoutModel;

public interface CheckoutRepository extends JpaRepository<CheckoutModel, Long> {
	
	@Query(value = "select * from products.orders where email = ?;", nativeQuery = true)
	public List<CheckoutModel> findbyemailcart(String email);
}
