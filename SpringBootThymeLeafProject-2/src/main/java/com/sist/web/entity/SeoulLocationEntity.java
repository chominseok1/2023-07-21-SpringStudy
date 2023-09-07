package com.sist.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="seoul_location")
@Getter
@Setter
public class SeoulLocationEntity {
/*NO int 
	TITLE text 
	POSTER text 
	MSG text 
	ADDRESS text 
	HIT int */
	@Id
	private int no;
	private int hit;
	private String title, poster,msg,address;
}
