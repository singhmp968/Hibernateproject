package com.jpa.test.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.exception.ResourceNotFoundException;
import com.jpa.test.model.Product;
import com.jpa.test.repository.ProductRepository;
@Service
@Transactional
public class productsssServices implements ProductService{

	
	@Autowired
	private ProductRepository productrepo;
	@Override
	public Product creatProduct(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		Optional<Product> producrDao = this.productrepo.findById(product.getId());
		if(producrDao.isPresent()) {
			Product productUpProduct = producrDao.get();
			productUpProduct.setId(product.getId());
			productUpProduct.setName(product.getName());
			productUpProduct.setDescription(product.getDescription());
			productrepo.save(productUpProduct);
		return productUpProduct;
		}
		
		else {
			throw new ResourceNotFoundException("fail");
		}
	}

	@Override
	public List<Product> getAllProduct(Long pId) {
		// TODO Auto-generated method stub
		return this.productrepo.findAll();
	}

	@Override
	public void deleteProduct(long pid) {
		// TODO Auto-generated method stub
		Optional<Product> pdb = this.productrepo.findById(pid);
		if(pdb.isPresent()) {
			this.productrepo.delete(pdb.get());
		}else
		{
			throw new ResourceNotFoundException("na");		}
		
		
	}
		
	

	@Override
	public Product getProductById(long pid) {
		// TODO Auto-generated method stub
		Optional<Product> pdb = this.productrepo.findById(pid);
		if(pdb.isPresent()) {
			return pdb.get();
		}else
		{
			throw new ResourceNotFoundException("na");		}
		
		
	}

}
