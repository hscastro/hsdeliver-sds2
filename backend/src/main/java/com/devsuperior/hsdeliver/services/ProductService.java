package com.devsuperior.hsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.hsdeliver.dto.ProductDTO;
import com.devsuperior.hsdeliver.entities.Product;
import com.devsuperior.hsdeliver.repositories.ProductRepository;

/**
 * Projeto java web com spring boot - hsdeliver
 * Desenvolvedor: Antonio Halyson
 * Email: halisonsc5@gmail.com
 * Data: 07/01/2021
 ***/

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAllByOrderByNameAsc(){
		List<Product> list = repository.findAll();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
	
}
