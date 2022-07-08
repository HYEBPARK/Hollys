package com.coffee.hollys.orderItem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.hollys.orderItem.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
