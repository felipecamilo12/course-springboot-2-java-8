package com.felipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
