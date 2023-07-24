package com.sist.main4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/*
 * 	ApplicationContext
 * 	AnnotationConfigApplicationContext ==> 5 
 */
public class MainClass {
	private Sawon sa;
	
	public Sawon getSa() {
		return sa;
	}

	public void setSa(Sawon sa) {
		this.sa = sa;
	}

	public static void main(String[] args) {
//		ApplicationContext app=new ClassPathXmlApplicationContext("app4.xml"); // close라는 메소드가 없음
		GenericXmlApplicationContext app=new GenericXmlApplicationContext("app4.xml"); 
		// 객체 메모리해제 하려면 GenericXmlApplicationContext close메소드
		/*Sawon sa=(Sawon)app.getBean("sa1"); //Dependency Lookup DL 
		// sa.init()
		sa.print();
		// sa.destroy() (x)
		app.close();*/
	}
}
