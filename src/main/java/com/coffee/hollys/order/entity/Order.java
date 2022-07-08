package com.coffee.hollys.order.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.coffee.hollys.member.entity.Member;
import com.coffee.hollys.order.Status;

import lombok.Getter;

@Getter
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;

	@Enumerated(EnumType.STRING)
	private Status status;

	protected Order() {
	}

	public Order(Member member, Status status) {
		this.member = member;
		this.status = status;
	}
}
