package com.example.jpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}