package com.coffee.hollys.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.hollys.item.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
