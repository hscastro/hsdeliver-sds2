package com.devsuperior.hsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hsdeliver.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
  //Nada de implementação aqui,...
}
