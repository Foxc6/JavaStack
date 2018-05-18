package com.example.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.productsandcategories.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findByNameNotIn(List<String> name);
}