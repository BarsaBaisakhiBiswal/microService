package com.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.ProductEntity;
import com.practice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductEntity> getAllProduct() {
		List<ProductEntity> productList = new ArrayList<>();
		try {
			productList = productRepository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public ProductEntity getProductByProductId(Integer prodId) {
		return productRepository.findById(prodId).get();
	}

}
