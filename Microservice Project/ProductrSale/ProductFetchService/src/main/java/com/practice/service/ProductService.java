package com.practice.service;

import java.util.List;

import com.practice.entity.ProductEntity;

public interface ProductService {

	List<ProductEntity> getAllProduct();

	ProductEntity getProductByProductId(Integer prodId);

}
