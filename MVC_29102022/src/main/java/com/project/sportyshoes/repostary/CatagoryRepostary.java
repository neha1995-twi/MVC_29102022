package com.project.sportyshoes.repostary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sportyshoes.model.Category;

public interface CatagoryRepostary extends JpaRepository<Category, Integer> {
		
	
	
}