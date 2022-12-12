package com.rodrigo_sutil.course_Udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo_sutil.course_Udemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
