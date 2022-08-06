package com.ecom.repositries;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.models.Product;
import com.ecom.models.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	Optional<User> findByEmail(String userName);

}
