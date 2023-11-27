package com.mx.josesaid.development;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {

    @Override
    List<Product> findAll();
}
