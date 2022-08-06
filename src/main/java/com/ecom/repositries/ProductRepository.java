package com.ecom.repositries;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.models.Category;
import com.ecom.models.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	Page<Product> findByCategory(Category cat, Pageable pageable);

}
