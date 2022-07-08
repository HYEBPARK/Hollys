package com.coffee.hollys.orderItem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.PositiveOrZero;

import com.coffee.hollys.item.entity.Item;
import com.coffee.hollys.order.entity.Order;

import lombok.Getter;

@Getter
@Entity
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@PositiveOrZero
	private int count;

	@PositiveOrZero
	private int price;

	protected OrderItem() {
	}

	public OrderItem(Item item, Order order, int count, int price) {
		this.item = item;
		this.order = order;
		this.count = count;
		this.price = price;
	}
}
