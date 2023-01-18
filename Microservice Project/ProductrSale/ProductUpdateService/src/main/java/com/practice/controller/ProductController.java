package com.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.ProductEntity;
import com.practice.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/updateProduct")
	public ProductEntity getAllProduct(@RequestBody ProductEntity productEntity) {
		ProductEntity product = new ProductEntity();
		try {
			product =  productService.save(productEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

}
