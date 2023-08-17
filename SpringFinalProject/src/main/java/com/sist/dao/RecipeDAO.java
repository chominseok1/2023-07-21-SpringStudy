package com.sist.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;
@Repository
public class RecipeDAO {
  @Autowired
  private RecipeMapper mapper;
  
  /*@Select("SELECT no,title,chef,poster,num "
	   		+ "FROM (SELECT no,title,chef,poster,rownum as num "
	   		+ "FROM (SELECT + INDEX_ASC(recipe recipe_no_pk)no,title,chef,poster "
	   		+ "FROM recipe)) "
	   		+ "WHERE num BETWEEN #{start} AND #{end}") */
   public List<RecipeVO> recipeListData(Map map)
   {
	   return mapper.recipeListData(map);
   }
}