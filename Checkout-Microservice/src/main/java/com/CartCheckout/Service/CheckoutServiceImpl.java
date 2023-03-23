package com.CartCheckout.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CartCheckout.Model.CheckoutModel;
import com.CartCheckout.Repository.CheckoutRepository;

@Service
public class CheckoutServiceImpl implements CheckoutService{

private CheckoutRepository checkoutrepository;
	

	public CheckoutServiceImpl(CheckoutRepository checkoutrepository) {
		super();
		this.checkoutrepository = checkoutrepository;
	}
	
	@Override
	public String addcheckout(CheckoutModel checkout) {
		checkoutrepository.save(checkout);
		return "Hi "+checkout.getEmail()+" + "+ checkout.getOrderid()+" successfully";
	}

	@Override
	public List<CheckoutModel> findbyemailcart(String email) {
		// TODO Auto-generated method stub
		return checkoutrepository.findbyemailcart(email);
	}

	
	
	

}
