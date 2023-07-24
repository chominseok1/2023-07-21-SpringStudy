package com.sist.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// XML 파싱 => 컨테이너에 등록 
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		Sawon s1=(Sawon)app.getBean("sa1"); // 강제 형변환
//		Sawon s2=(Sawon)app.getBean("sa2");
//		Sawon s3=(Sawon)app.getBean("sa3");
		System.out.println("사번:"+s1.getSabun());
		System.out.println("이름:"+s1.getName());
		System.out.println("부서:"+s1.getDept());
		System.out.println("직위:"+s1.getJob());
		System.out.println("연봉:"+s1.getPay());
//		System.out.println("=========================");
//		System.out.println("사번:"+s2.getSabun());
//		System.out.println("이름:"+s2.getName());
//		System.out.println("부서:"+s2.getDept());
//		System.out.println("직위:"+s2.getJob());
//		System.out.println("연봉:"+s2.getPay());
//		System.out.println("=========================");
//		System.out.println("사번:"+s3.getSabun());
//		System.out.println("이름:"+s3.getName());
//		System.out.println("부서:"+s3.getDept());
//		System.out.println("직위:"+s3.getJob());
//		System.out.println("연봉:"+s3.getPay());
		System.out.println("====================");
		Sawon s2=app.getBean("sa1",Sawon.class); // 제네릭스 자동형변환 형변환 Sawon s1=(Sawon)app.getBean("sa1"); id명칭 동일 => 싱글톤
		s2.setSabun(2);
		s2.setName("심청이");
		s2.setDept("총무부");
		s2.setJob("과장");
		s2.setPay(4000);
		
		System.out.println("사번:"+s1.getSabun());
		System.out.println("이름:"+s1.getName());
		System.out.println("부서:"+s1.getDept());
		System.out.println("직위:"+s1.getJob());
		System.out.println("연봉:"+s1.getPay());
		// s2와 s1은 같은 객체 싱글톤 
		System.out.println("s1:"+s1); 
		System.out.println("s2:"+s2);
		// 객체 주소 동일 한개의 공간 사용 싱글톤(스프링 기본)
		// scope:prototype : clone 객체 복제 객체 주소가 다름 
		// 기본은 싱글톤 객체가 많으면 prototype으로 객체 복제 
	}

}
