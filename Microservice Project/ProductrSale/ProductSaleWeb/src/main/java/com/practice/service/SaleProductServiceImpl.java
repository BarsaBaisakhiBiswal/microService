package com.practice.service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.bean.Product;
import com.practice.bean.Sale;

@Service
public class SaleProductServiceImpl implements SaleProductService {
	
	RestTemplate restTemplate = new RestTemplate();
	public static String msg = "";

	@Override
	public List<Product> getAllProduct() {
		ResponseEntity<Product[]> productList  = restTemplate.getForEntity("http://localhost:8081/getAllProduct", Product[].class);
		Product prod[] = productList.getBody();
		List<Product> products = new ArrayList<>();
		for (Product product : prod) {
			products.add(product);
		}
		return products;
	}

	@Override
	public String saveData(Product product) {
		Product prosuctSave = new Product();
		Sale sale = new Sale();
		ResponseEntity<Product> prod = restTemplate.getForEntity("http://localhost:8081/getProductByProductId/"+product.getProductId(), Product.class);
		Product pro = prod.getBody();
		prosuctSave.setProductId(pro.getProductId());
		prosuctSave.setProductName(pro.getProductName());
		if(pro.getAvailbleQty()-product.getAvailbleQty()<0) {
			return "Product Not Available";
		}
		prosuctSave.setAvailbleQty(pro.getAvailbleQty()-product.getAvailbleQty());
		prosuctSave.setRate(pro.getRate());
		
		ResponseEntity<Product> update  = restTemplate.postForEntity("http://localhost:8082/updateProduct", prosuctSave, Product.class);
		
		
		sale.setProductId(pro.getProductId());
		sale.setProductName(pro.getProductName());
		Integer qty = product.getAvailbleQty();
		sale.setQty(qty);
		Double total = pro.getRate()*product.getAvailbleQty();
		sale.setTotalRate(total.toString()); 
	    String strDate= new SimpleDateFormat("yyyy-mm-dd").format(new Date());
	    sale.setDateOfBuy(strDate);
	    ResponseEntity<Sale> saveSale = restTemplate.postForEntity("http://localhost:8083/saveSale", sale, Sale.class);
		
		
		
		return "Updated";
	}

}
