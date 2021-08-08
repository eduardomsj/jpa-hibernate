package com.example.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpahibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}