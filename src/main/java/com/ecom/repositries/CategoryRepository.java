package com.ecom.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.models.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
