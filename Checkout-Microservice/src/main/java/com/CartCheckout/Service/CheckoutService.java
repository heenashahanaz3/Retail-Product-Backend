package com.CartCheckout.Service;

import java.util.List;

import com.CartCheckout.Model.CheckoutModel;

public interface CheckoutService {
	
	String addcheckout(CheckoutModel checkout);
	List<CheckoutModel> findbyemailcart(String email);

}
