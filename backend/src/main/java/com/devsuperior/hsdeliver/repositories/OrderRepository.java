package com.devsuperior.hsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.hsdeliver.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
