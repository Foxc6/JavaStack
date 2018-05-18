package com.example.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.productsandcategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findByNameNotIn(List<String> name);
}
