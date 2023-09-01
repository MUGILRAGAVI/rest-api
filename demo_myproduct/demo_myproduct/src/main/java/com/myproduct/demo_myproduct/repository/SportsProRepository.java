package com.myproduct.demo_myproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproduct.demo_myproduct.entities.ProductEntities;

public interface SportsProRepository extends JpaRepository<ProductEntities,Integer> {

}

