package com.practice.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="sale_ms")
@Entity
public class Sale implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sale_id")
	private Integer saleId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_name")
	private String productName;

	private Integer qty;
	
	@Column(name = "total_rate")
	private String totalRate;
	
	@Column(name = "dob")
	private Date dateOfBuy;

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

	public String getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(String totalRate) {
		this.totalRate = totalRate;
	}

	public Date getDateOfBuy() {
		return dateOfBuy;
	}

	public void setDateOfBuy(Date dateOfBuy) {
		this.dateOfBuy = dateOfBuy;
	}
	
	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", productId=" + productId + ", productName=" + productName + ", qty=" + qty
				+ ", totalRate=" + totalRate + ", dateOfBuy=" + dateOfBuy + "]";
	}

	

	
	
	

}
