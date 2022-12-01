package com.project.sportyshoes.repostary;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sportyshoes.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}