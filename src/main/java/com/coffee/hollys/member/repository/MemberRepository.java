package com.coffee.hollys.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.hollys.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
