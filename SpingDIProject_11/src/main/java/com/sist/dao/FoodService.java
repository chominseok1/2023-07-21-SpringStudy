package com.sist.dao;
// 단독적으로 사용하면 dao
// 통합해서 쓰면 service dao 여러개 묶

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
	@Autowired
	private FoodDAO fdao;
	@Autowired
	private CategoryDAO cdao;
	
	public List<CategoryVO> cateListData()
	{
		return cdao.cateListData();
	}
	public List<FoodVO> foodCategoryListData(int cno)
	{
		return fdao.foodCategoryListData(cno);
	}
	public FoodVO foodDetailData(int fno)
	{
		return fdao.foodDetailData(fno);
	}
	
}
