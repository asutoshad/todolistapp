package com.example.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
