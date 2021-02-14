package com.jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
