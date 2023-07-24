package com.sist.main2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter 
@Getter
@AllArgsConstructor // 생성자 만들기 오라클 연동 AllArgsConstructor 다섯개 매개변수를 포함하는 생성자 갖고 오ㅁ
public class Member {
  private String id;
  private String name;
  private String address;
  private String phone;
  private String sex;
  public void print()
  {
	  System.out.println("ID:"+id);
	  System.out.println("Name:"+name);
	  System.out.println("address:"+address);
	  System.out.println("Phone:"+phone);
	  System.out.println("Sex:"+sex);
  }
}
