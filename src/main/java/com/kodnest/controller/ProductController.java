package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.Laptop;
import com.kodnest.entity.Product;
import com.kodnest.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;
	
	
	//This is used to fetch all the data.

	@GetMapping(value="/products")
	public List<Product> getProduct() {
		return productservice.getProduct();
	}
	
	// This is used to fetch only by particular id.
	
	@GetMapping(value="/products/{id}")
	public Product getProductById( @PathVariable int id) {
		return productservice.getProductById(id);
        
	}
	
	@PostMapping(value="/products/post")
	public void postProduct(@RequestBody Product product) {
		System.out.println(product);
		productservice.postProduct(product);
	}
	
	@DeleteMapping(value="/products/delete/{id}")
     public void deleteProduct(@PathVariable int id) {
		System.out.println(id);
		productservice.deleteProduct(id);
	}
	
	@PutMapping(value="/products/update/{id}")
	public void updateProduct(@PathVariable int id,@RequestBody Product product) {
		System.out.println(id);
		System.out.println(product);
		productservice.getProduct(id,product);
	}
	
	

}
