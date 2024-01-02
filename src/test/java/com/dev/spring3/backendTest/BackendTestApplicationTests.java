package com.dev.spring3.backendTest;

import com.dev.spring3.backendTest.entity.Product;
import com.dev.spring3.backendTest.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class BackendTestApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void testCreateProduct() {
		Product prod = new Product("Lacoste",100.500,new Date());
		productRepository.save(prod);
	}
	@Test
	public void findProduct(){
		Product p= productRepository.findById(1L).get();
				System.out.println(p);
	}
	@Test
	public void deleteProduct(){
		 productRepository.deleteById(4L);
		 productRepository.findAll();
	}
	@Test
	public void findAllProduct(){
		System.out.println(productRepository.findAll());

	}
	@Test
	public void updateProduct(){
		Product p= productRepository.findById(3L).get();
		p.setPriceProduct(8700.00);
		productRepository.save(p);
		System.out.println(p);
	}
}
