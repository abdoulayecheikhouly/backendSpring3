package com.dev.spring3.backendTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.spring3.backendTest.entity.Product;
import com.dev.spring3.backendTest.entity.Category;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
