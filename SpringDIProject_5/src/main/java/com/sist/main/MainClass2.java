package com.sist.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.FoodDAO;
import com.sist.dao.FoodVO;
import com.sist.dao.SeoulDAO;
import com.sist.dao.SeoulLocationVO;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app2.xml");
		FoodDAO dao=(FoodDAO)app.getBean("dao2");
		List<FoodVO> list=dao.foodListData();
		System.out.println("============맛집===========");
		for(FoodVO vo:list)
		{
			System.out.println(vo.getCno()+"."+vo.getTitle());
		}
	}

}
