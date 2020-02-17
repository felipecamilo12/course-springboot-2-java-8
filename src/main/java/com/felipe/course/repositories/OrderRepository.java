package com.felipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
