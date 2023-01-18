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
	public ProductEntity save(ProductEntity productEntity) {
		ProductEntity product = new ProductEntity();
		try {
			product = productRepository.save(productEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

}
