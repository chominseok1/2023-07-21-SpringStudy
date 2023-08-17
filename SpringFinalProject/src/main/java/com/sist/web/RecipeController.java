package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {
 @GetMapping("recipe/recipe_list.do")
 public String recipe_list(Model model)
 {
	 model.addAttribute("main_jsp", "../recipe/recipe_list.jsp");
	 return "main/main";
 }
}
