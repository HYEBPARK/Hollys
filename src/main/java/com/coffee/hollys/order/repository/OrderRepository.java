package com.coffee.hollys.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.hollys.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
