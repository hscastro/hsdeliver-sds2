package com.devsuperior.hsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.hsdeliver.dto.OrderDTO;
import com.devsuperior.hsdeliver.dto.ProductDTO;
import com.devsuperior.hsdeliver.entities.Order;
import com.devsuperior.hsdeliver.entities.OrderStatus;
import com.devsuperior.hsdeliver.entities.Product;
import com.devsuperior.hsdeliver.repositories.OrderRepository;
import com.devsuperior.hsdeliver.repositories.ProductRepository;

/**
 * Projeto java web com spring boot - hsdeliver
 * Desenvolvedor: Antonio Halyson
 * Email: halisonsc5@gmail.com
 * Data: 07/01/2021
 ***/

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findOrderWithProducts(){
		List<Order> list = repository.findOrderWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = false)
	public OrderDTO insert(OrderDTO dto) {
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(),
				Instant.now(), OrderStatus.PENDING);
		
		for(ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		
		order = repository.save(order);
		return new OrderDTO(order);		
	}
	
	
}
