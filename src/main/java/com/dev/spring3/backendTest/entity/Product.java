package com.dev.spring3.backendTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProduct ;
    @Setter
    private String nomProduct;
    @Setter
    private String categoryProduct;
    @Setter
    private  Double priceProduct;
    private Date dateCreated;

    public Product() {
        super();
    }

    public Product(String nomProduct, String categoryProduct, Double priceProduct, Date dateCreated) {
        super();
        this.nomProduct = nomProduct;
        this.categoryProduct = categoryProduct;
        this.priceProduct = priceProduct;
        this.dateCreated = dateCreated;
    }

}
