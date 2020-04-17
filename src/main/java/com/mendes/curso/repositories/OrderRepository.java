package com.mendes.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendes.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
