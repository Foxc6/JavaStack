package com.example.productsandcategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productsandcategories.models.CategoriesProducts;

@Repository
public interface CategoriesProductsRepository extends CrudRepository<CategoriesProducts, Long>{

}
