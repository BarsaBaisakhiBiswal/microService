package com.practice.bean;

import java.io.Serializable;
import java.sql.Date;


public class Sale implements Serializable {
	
	private Integer saleId;
	
	private Integer productId;
	
	private String productName;

	private Integer qty;
	
	private String totalRate;

	private String dateOfBuy;

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

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

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(String totalRate) {
		this.totalRate = totalRate;
	}

	public String getDateOfBuy() {
		return dateOfBuy;
	}

	

	public void setDateOfBuy(String dateOfBuy) {
		this.dateOfBuy = dateOfBuy;
	}

	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", productId=" + productId + ", productName=" + productName + ", qty=" + qty
				+ ", totalRate=" + totalRate + ", dateOfBuy=" + dateOfBuy + "]";
	}
	
	

}
