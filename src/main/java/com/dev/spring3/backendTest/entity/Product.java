package com.dev.spring3.backendTest.entity;

import jakarta.persistence.*;
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

    @ManyToOne
    private Category categoryProduct;
    @Setter
    private  Double priceProduct;
    private Date dateCreated;

    public Product() {
        super();
    }

    public Product(String nomProduct, Double priceProduct, Date dateCreated) {
        super();
        this.nomProduct = nomProduct;
        this.priceProduct = priceProduct;
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nomProduct='" + nomProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
