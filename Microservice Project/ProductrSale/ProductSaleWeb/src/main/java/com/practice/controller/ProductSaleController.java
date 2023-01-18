package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.bean.Product;
import com.practice.service.SaleProductService;

@Controller
@RequestMapping("/productWeb")
public class ProductSaleController {
	@Autowired
	private SaleProductService saleProductService;
	
	
	@RequestMapping("/")
	public String dashBoard(Model model) {
		List<Product> productList = saleProductService.getAllProduct();
		model.addAttribute("product", productList);
		return "dashboard";
	}
	
	@RequestMapping("/saveData")
	public String saveData(@ModelAttribute Product product,Model model) {
		String msg = saleProductService.saveData(product);
		
		model.addAttribute("valid",msg);
		if(msg.equals("Product Not Available")) {
			List<Product> productList = saleProductService.getAllProduct();
			model.addAttribute("product", productList);
			return "dashboard";
		}
		return "redirect:/productWeb/";
	}

}
