package com.jpa.test.service;

import com.jpa.test.model.Product;
import java.util.*;

public interface ProductService {

	Product creatProduct(Product product);
	Product updateProduct(Product product);
	Product getProductById(long pid);
	List<Product> getAllProduct(Long pId);
	void deleteProduct(long pid);
	
}
