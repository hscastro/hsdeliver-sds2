package com.devsuperior.hsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hsdeliver.dto.ProductDTO;
import com.devsuperior.hsdeliver.services.ProductService;

/**
 * Projeto java web com spring boot - hsdeliver
 * Desenvolvedor: Antonio Halyson
 * Email: halisonsc5@gmail.com
 * Data: 07/01/2021
 ***/

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll() {
		List<ProductDTO> list = service.findAllByOrderByNameAsc();
		return ResponseEntity.ok().body(list);
	}

}
