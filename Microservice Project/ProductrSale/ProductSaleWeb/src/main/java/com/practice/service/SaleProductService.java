package com.practice.service;

import java.util.List;

import com.practice.bean.Product;

public interface SaleProductService {

	List<Product> getAllProduct();

	String saveData(Product product);

}
