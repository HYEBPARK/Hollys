package com.coffee.hollys.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;

@Getter
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	@Size(min = 2, max = 10)
	private String name;

	@NotBlank
	@Size(min = 6, max = 12)
	@Column(unique = true)
	private String userId;

	@NotBlank
	@Size(min = 6, max = 12)
	private String password;

	protected Member() {
	}

	public Member(String name, String userId, String password) {
		this.name = name;
		this.userId = userId;
		this.password = password;
	}
}
