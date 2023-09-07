package com.sist.web.dao;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sist.web.entity.*;
@Repository
public interface FoodDAO extends JpaRepository<FoodEntity,Integer>{
  //public FoodEntity findByFno(int fno); //상세보기 할때 SELECT * FROM FOOD_LOCATION WHERE FNO=FNO
  // SELECT * FROM food_location WHERE fno=1(int fno가 들어감)
  // insert,update,delete 선언 안해도됨 
  @Query(value="SELECT * FROM food_location "
  		+ "WHERE address LIKE CONCAT('%',:address,'%') "
  		+ "ORDER BY fno ASC "
  		+ "LIMIT :start , 12",nativeQuery=true) // nativeQuery=true쿼리 문을 있는 그대로 수행함
  public List<FoodEntity> foodFindData(@Param("address") String address,@Param("start") Integer start); 
  
  @Query(value="SELECT CEIL(COUNT(*)/12.0) FROM food_location "
  		+ "WHERE address LIKE CONCAT('%',:address,'%')",nativeQuery=true)
  public int foodFindTotalPage(String address);
  
  public FoodEntity findByFno(@Param("fno") Integer fno);
  // select * from food_location where fno=1 
}
