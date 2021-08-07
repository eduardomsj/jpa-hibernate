package com.example.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}