package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.practice.entity.Sale;
import com.practice.service.SaleService;

@RestController
public class SaleController {
	@Autowired
	private SaleService saleService;
	
	@RequestMapping("saveSale")
	public Sale saveSale(@RequestBody Sale sale) {
		Sale saleData = new Sale();
		try {
			saleData = saleService.saveSale(sale);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saleData;
	}

}
