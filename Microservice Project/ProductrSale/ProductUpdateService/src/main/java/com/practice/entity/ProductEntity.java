package com.practice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="product_ms")
@Entity
public class ProductEntity implements Serializable {
	
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "available_qty")
	private Integer availbleQty;
	
	@Column(name = "rate")
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
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", availbleQty=" + availbleQty
				+ ", rate=" + rate + "]";
	}
	
	
	
	

}
