package com.Cart.Service;


import java.util.List;

import com.Cart.Model.CartModel;
import com.Cart.exception.ProductNotFoundException;

public interface CartService {
	
	String addcartbyUserIdAndproductId(CartModel cart) throws ProductNotFoundException;
	boolean getById(String email);
	String getbyemail(String email);
	CartModel delpro(CartModel cart)throws ProductNotFoundException;
	void deletecart(String email);
	
}
