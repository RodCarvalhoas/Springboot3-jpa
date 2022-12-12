package com.rodrigo_sutil.course_Udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo_sutil.course_Udemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
