package com.ecom.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.models.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
