package com.sist.web.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.dao.*;
import com.sist.web.entity.*;
@RestController
@RequestMapping("food/")
@CrossOrigin("http://localhost:3000")
public class FoodRestController {
  @Autowired
  private FoodCategoryDAO dao;
  @Autowired
  private FoodDAO fdao;
  
  @GetMapping("category1")
  public List<CategoryEntity> food_category1()
  {
	  List<CategoryEntity> list=dao.categoryData1();
	  return list;
  }
  @GetMapping("category2")
  public List<CategoryEntity> food_category2()
  {
	  List<CategoryEntity> list=dao.categoryData2();
	  return list;
  }
  @GetMapping("category3")
  public List<CategoryEntity> food_category3()
  {
	  List<CategoryEntity> list=dao.categoryData3();
	  return list;
  }
  
  @GetMapping("category_info_react")
  public CategoryEntity category_info(int cno)
  {
	  CategoryEntity vo=dao.findByCno(cno);
	  return vo;
  }
  @GetMapping("food_list_react")
  public List<FoodEntity> food_list(int cno)
  {
	  List<FoodEntity> list=fdao.foodListData(cno);
	  return list;
  }
  @GetMapping("food_detail_react")
  public FoodEntity food_detail(int fno)
  {
	  FoodEntity vo=fdao.findByFno(fno);
	  return vo;
  }
}
