package com.devsuperior.hsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hsdeliver.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
  
	List<Product> findAllByOrderByNameDesc();
}
