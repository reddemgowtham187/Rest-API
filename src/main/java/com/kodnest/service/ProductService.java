package com.kodnest.service;

import java.util.List;


import com.kodnest.entity.Product;

public interface ProductService {
	
	List<Product>getProduct();

	Product getProductById(int id);

	void postProduct(Product product);

	void deleteProduct(int id);

	void getProduct(int id, Product product);
	

}
