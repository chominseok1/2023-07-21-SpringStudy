package com.sist.dao;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.main.*;
import com.sist.mapper.EmpMapper;
import com.sist.vo.*;
@Repository("dao")
public class EmpDAO {
	@Autowired // getBean 대신에 @Autowired 자동으로 
	private EmpMapper mapper;
	public List<EmpVO> empListData()
	{
		return mapper.empListData();
	}
	
	public EmpVO empDetailData(int empno)
	{
		return mapper.empDetailData(empno);
	}
	public List<EmpVO> empFindData(String ename)
	{
		return mapper.empFindData(ename);
	}
}
