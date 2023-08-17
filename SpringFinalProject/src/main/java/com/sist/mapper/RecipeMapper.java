package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.RecipeVO;
public interface RecipeMapper {
   @Select("SELECT no,title,chef,poster,num "
   		+ "FROM (SELECT no,title,chef,poster,rownum as num "
   		+ "FROM (SELECT /*+ INDEX_ASC(recipe recipe_no_pk)*/no,title,chef,poster "
   		+ "FROM recipe)) "
   		+ "WHERE num BETWEEN #{start} AND #{end}")
   public List<RecipeVO> recipeListData(Map map);
}
