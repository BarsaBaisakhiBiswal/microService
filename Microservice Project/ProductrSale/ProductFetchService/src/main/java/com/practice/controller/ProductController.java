package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.ProductEntity;
import com.practice.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/getAllProduct")
	public List<ProductEntity> getAllProduct() {
		List<ProductEntity>  productList = new ArrayList<>();
		try {
			productList = productService.getAllProduct();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	@RequestMapping("/getProductByProductId/{prodId}")
	public ProductEntity getProductByProductId(@PathVariable Integer prodId) {
		
		return productService.getProductByProductId(prodId);
		
	}

}
