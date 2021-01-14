package com.devsuperior.hsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.hsdeliver.entities.Order;
import com.devsuperior.hsdeliver.entities.OrderStatus;

public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String address;
	
	private double latitude;
	
	private double longitude;
	
	private Instant moment;
	
	private OrderStatus status;
	
	private Double total;
	
	private List<ProductDTO> products = new ArrayList<>();
	
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderDTO(Long id, String address, double latitude, double longitude, Instant moment, OrderStatus status,
			Double total) {
		super();
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
		this.total = total;
	}


	public OrderDTO(Order entity) {
		id = entity.getId();
		address = entity.getAddress();
		latitude = entity.getLatitude();
		longitude = entity.getLongitude();
		moment = entity.getMoment();
		status = entity.getOrderStatus();
		total = entity.getTotal();
		products = entity.getProducts().stream()
				.map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}
	

}
