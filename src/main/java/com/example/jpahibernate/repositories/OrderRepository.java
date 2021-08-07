package com.example.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}