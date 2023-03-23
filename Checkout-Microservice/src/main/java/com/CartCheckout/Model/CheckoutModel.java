package com.CartCheckout.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class CheckoutModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long orderid;
	
	@Column(name="email")
	private String email;
	
	@Column(name="cart")
	private String cart;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="deliveryaddress")
	private String deliveryaddress;
	
	public CheckoutModel() {
		
	}

	public CheckoutModel(Long orderid, String email, String cart, Double amount, String deliveryaddress) {
		super();
		this.orderid = orderid;
		this.email = email;
		this.cart = cart;
		this.amount = amount;
		this.deliveryaddress = deliveryaddress;
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	@Override
	public String toString() {
		return "CheckoutModel [orderid=" + orderid + ", email=" + email + ", cart=" + cart + ", amount=" + amount
				+ ", deliveryaddress=" + deliveryaddress + "]";
	}
	
	
}
