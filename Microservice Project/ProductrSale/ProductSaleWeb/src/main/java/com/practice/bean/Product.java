package com.practice.bean;

import java.io.Serializable;


public class Product implements Serializable {
	
	private Integer productId;
	
	private String productName;
	
	private Integer availbleQty;
	
	private Double rate;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getAvailbleQty() {
		return availbleQty;
	}

	public void setAvailbleQty(Integer availbleQty) {
		this.availbleQty = availbleQty;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", availbleQty=" + availbleQty
				+ ", rate=" + rate + "]";
	}
	
	

}
