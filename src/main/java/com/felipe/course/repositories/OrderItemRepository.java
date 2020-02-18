package com.felipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
