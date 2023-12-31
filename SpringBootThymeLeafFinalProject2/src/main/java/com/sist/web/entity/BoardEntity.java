package com.sist.web.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.Setter;
/*
 * no int AI PK 
	name varchar(51) 
	subject varchar(2000) 
	content text 
	pwd varchar(10) 
	regdate datetime 
	hit int
 */
@Entity
@Table(name="board")
@Getter
@Setter
@DynamicUpdate
public class BoardEntity {
	@Id
	private int no;
	private String name,subject,content;
	@Column(insertable = true,updatable = false) // 추가(insert), 수정x
	private String pwd; // 비밀번호 업데이트 x
	private int hit;
	@Column(insertable = true,updatable = false) // 추가(insert), 수정x
	private String regdate; // 날짜 업데이트 x
	
	@PrePersist
	public void regdate() {
		this.regdate=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
}
