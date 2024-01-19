package com.example.web.Service;

import java.util.List;

import com.example.web.model.Products;



public interface ProductService {
	
	Products saveProducts(Products products);
	List<Products> getProducts();

}
