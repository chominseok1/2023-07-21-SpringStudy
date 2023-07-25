package com.sist.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class FoodDAO extends SqlSessionDaoSupport {
	public List<FoodVO> foodListData()
	{
		return getSqlSession().selectList("foodListData"); //id(키)를 넘겨주면 밑에 sql문장(값) 읽어옴
	}
}
