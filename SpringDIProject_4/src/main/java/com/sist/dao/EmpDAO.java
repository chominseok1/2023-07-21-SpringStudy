package com.sist.dao;
import java.util.*;

import org.mybatis.spring.support.SqlSessionDaoSupport;
public class EmpDAO extends SqlSessionDaoSupport {
	
	public List<EmpVO> empListData()
	{
		return getSqlSession().selectList("empListData"); // sql 문장 empListData 값 여러개 받을때
	}
	public EmpVO empDetailData(int empno)
	{
		return getSqlSession().selectOne("empDetailData", empno); // 값 하나 받을때
	}
}
