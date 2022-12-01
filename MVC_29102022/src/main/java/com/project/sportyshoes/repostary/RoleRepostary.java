package com.project.sportyshoes.repostary;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sportyshoes.model.Role;



public interface RoleRepository extends JpaRepository<Role, Integer> {

	
}
