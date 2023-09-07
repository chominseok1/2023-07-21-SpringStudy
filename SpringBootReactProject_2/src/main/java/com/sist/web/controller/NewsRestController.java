package com.sist.web.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sist.web.entity.*;
import com.sist.web.manager.*;
@RestController
@RequestMapping("news/")
@CrossOrigin("http://localhost:3000")
public class NewsRestController {
 @Autowired
 private NewsManager mgr;
 
 @GetMapping("news_find_react")
 public List<NewsVO> news_find(String fd)
 {
	 List<NewsVO> list=mgr.newsFind(fd);
	 return list;
 }
}
