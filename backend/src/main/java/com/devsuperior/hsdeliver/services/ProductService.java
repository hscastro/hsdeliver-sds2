package com.devsuperior.hsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.hsdeliver.dto.ProductDTO;
import com.devsuperior.hsdeliver.entities.Product;
import com.devsuperior.hsdeliver.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAll();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
	
}
