package com.jpa.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.model.Product;
import com.jpa.test.service.productsssServices;

@RestController
public class ProductController {

	@Autowired
	private productsssServices ps;
	
	public ResponseEntity<List<Product>> getAllProduct() {
		return ResponseEntity.ok().body(productsssServices.class);
		}
	
	
}
