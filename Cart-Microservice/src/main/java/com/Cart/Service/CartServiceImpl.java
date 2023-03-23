package com.Cart.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Cart.Model.CartModel;
import com.Cart.Repository.CartRepository;
import com.Cart.exception.ProductNotFoundException;

@Service
public class CartServiceImpl implements CartService{
	
	private CartRepository cartrepository;
	

	public CartServiceImpl(CartRepository cartrepository) {
		super();
		this.cartrepository = cartrepository;
	}



	@Override
	public String addcartbyUserIdAndproductId(CartModel Cart) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		if(getById(Cart.getEmail().toString())) {
			cartrepository.save(Cart);
			return Cart.getCart();
		}
		else {
			CartModel existingcart = cartrepository.findById(Cart.getEmail()).orElseThrow(() -> new ProductNotFoundException(null));
			existingcart.setCart(Cart.getCart());
			cartrepository.save(existingcart);
			return existingcart.getCart();
		}
	}
	
	

	@Override
	public String getbyemail(String email) {
		// TODO Auto-generated method stubSS
		return cartrepository.getcartbyemail(email);
	}



	@Override
	public boolean getById(String email){
		// TODO Auto-generated method stub
		String res = cartrepository.checkcart(email);
		if(res != "") {
			return true;
		}
		return false;
	}



	@Override
	public CartModel delpro(CartModel cart) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		CartModel existingcart = cartrepository.findById(cart.getEmail()).orElseThrow(() -> new ProductNotFoundException(null));
		List<String> products = new ArrayList<>(Arrays.asList((existingcart.getCart()).split(",")));
		int pindex = products.indexOf(cart.getCart());
		String removed = products.remove(pindex);
		existingcart.setCart(String.join(",", products));
		cartrepository.save(existingcart);
		return existingcart;
	}



	@Override
	public void deletecart(String email) {
		cartrepository.findById(email);
		cartrepository.deleteById(email);
	}
	
	

}
	
