package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sist.dao.*;
import com.sist.vo.*;

@RestController
public class FoodRestController {
 @Autowired
 private FoodDAO dao;
 
 @GetMapping(value="food/category_vue.do",produces ="text/plain;charset=UTF-8")  //vue들어가면 restController
  public String food_category() throws Exception  //json
  {
	 List<CategoryVO> list=dao.foodCategoryListData();
	 ObjectMapper mapper=new ObjectMapper();
	 String json=mapper.writeValueAsString(list);
	 return json;
  }
}
