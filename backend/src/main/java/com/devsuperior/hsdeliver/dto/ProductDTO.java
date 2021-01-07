package com.devsuperior.hsdeliver.dto;

import java.io.Serializable;

import com.devsuperior.hsdeliver.entities.Product;

/**
 * Projeto java web com spring boot - hsdeliver
 * Desenvolvedor: Antonio Halyson
 * Email: halisonsc5@gmail.com
 * Data: 07/01/2021
 ***/

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private double price;

	private String description;

	private String imageUri;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Product entity) {
		
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		description = entity.getDescription();
		imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	
	
}
