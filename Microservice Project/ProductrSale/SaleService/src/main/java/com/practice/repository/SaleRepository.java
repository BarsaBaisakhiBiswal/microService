package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

}
