package com.felipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
