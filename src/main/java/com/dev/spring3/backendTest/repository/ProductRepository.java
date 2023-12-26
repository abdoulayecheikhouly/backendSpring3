package com.dev.spring3.backendTest.repository;

import com.dev.spring3.backendTest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {


}
