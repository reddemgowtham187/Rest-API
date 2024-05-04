package com.kodnest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Laptop;
import com.kodnest.entity.Product;
import com.kodnest.repository.ProductRepository;
import com.kodnest.service.ProductService;

@Service
public  class ProductServiceImpl implements ProductService{

	@Autowired
	 ProductRepository productRepository;
	@Override
	public List<Product> getProduct() {
		return productRepository.findAll();
	}
	@Override
	public Product getProductById(int id) {
		Optional<Product> product= productRepository.findById(id);
	      return product.orElse(null);
	}
	@Override
	public void postProduct(Product product) {
	    productRepository.save(product);	
	}
	@Override
	public void deleteProduct(int id) {
          productRepository.deleteById(id);		
	}
	@Override
	public void getProduct(int pid, Product upprod) {
		Optional<Product> exisprod = productRepository.findById(pid);
        
        if(exisprod.isPresent()) {
        	//Updating logic
        	Product product = exisprod.get();
        	
        	String newname=upprod.getPname();
        	product.setPname(newname);
        	
        	productRepository.save(product);
        	System.out.println("Update Success!!");
        }
        else {
        	System.out.println("Record is not found!!");
        }		
}
		
	}


