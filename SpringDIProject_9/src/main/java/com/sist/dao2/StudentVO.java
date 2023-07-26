package com.sist.dao2;

import lombok.Getter;
import lombok.Setter;
/*
 * CREATE TABLE student(
	    hakbun NUMBER,
	    name VARCHAR2(51) CONSTRAINT std_name_nn NOT NULL,
	    kor NUMBER,
	    eng NUMBER,
	    math NUMBER,
	    CONSTRAINT std_hakbun_pk PRIMARY KEY(hakbun)
	);
 */
/*
 * HAKBUN NOT NULL NUMBER       
	NAME   NOT NULL VARCHAR2(51) 
	KOR             NUMBER       
	ENG             NUMBER       
	MATH            NUMBER       
 */
@Getter // 읽기
@Setter // 쓰기 
public class StudentVO {
	private int hakbun,kor,eng,math;
	private String name; 
}
