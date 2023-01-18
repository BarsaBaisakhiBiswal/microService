package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Sale;
import com.practice.repository.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {
	@Autowired
	private SaleRepository saleRepository;

	@Override
	public Sale saveSale(Sale sale) {
		Sale saleData = new Sale();
		try {
			saleData = saleRepository.save(sale);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return saleData;
	}

}
