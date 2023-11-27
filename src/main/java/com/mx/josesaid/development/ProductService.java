package com.mx.josesaid.development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductJpaRepository productJpaRepository;

    public ProductService(ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    public List<Product> getProducts(){
        return productJpaRepository.findAll();
        //return "All the products";
    }

}
