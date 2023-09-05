package com.sist.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity // 엔티티 선언 테이블 지정 변수 매칭 
@Table(name="food_house") //jpa 변수와 매칭 / 자동설정
@Getter
@Setter
public class FoodEntity {
	@Id // 자동증가되는 번호 
	private int fno; //자동 증가번호 
	////////////////////
	private int hit;
	private double score;
	private String name,address,phone,type,price,time,parking,menu,poster;
}
