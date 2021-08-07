package com.example.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}