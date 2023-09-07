package com.sist.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.web.dao.SeoulLocationDAO;
import com.sist.web.entity.SeoulLocationEntity;

@Controller
public class SeoulController {
@Autowired
private SeoulLocationDAO dao;

@RequestMapping("seoul/seoul_location")
public String seoul_find(String page,String fd, Model model)
{
	if(fd==null)
		fd="서울";
	if(page==null)
		page="1";
	int curpage=Integer.parseInt(page);
	Map map=new HashMap();
	int rowSize=12;
	int start=(rowSize*curpage)-(rowSize); //리밋은 번호가 0부터 시작 
	int end=(rowSize*curpage);
	map.put("start", start);
	map.put("address", fd);
	List<SeoulLocationEntity> list=dao.seoulFindData(fd, start);
	int totalpage=dao.seoulFindTotalPage(fd);
	
	 final int BLOCK=10;
	 int startPage=((curpage-1)/BLOCK*BLOCK)+1;
	 int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
	 
	 if(endPage>totalpage)
		 endPage=totalpage;
	 
	 model.addAttribute("curpage", curpage);
	 model.addAttribute("totalpage", totalpage);
	 model.addAttribute("startPage", startPage);
	 model.addAttribute("endPage", endPage);
	 model.addAttribute("list", list);
	 model.addAttribute("fd", fd);
	 
	 return "seoul/seoul_location";
}
}
