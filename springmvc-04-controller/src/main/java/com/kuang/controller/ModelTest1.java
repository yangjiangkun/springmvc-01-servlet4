package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {

//	@RequestMapping("/t1")  //不通过视图解析器，也可以通过HttpServletRequest request, HttpServletResponse response 进行定向和转发
//	public String test1(HttpServletRequest request, HttpServletResponse response){
//		HttpSession session = request.getSession();
//		System.out.println(session.getId());
//
//		return "test";
//	}
//
//	@RequestMapping("/t2")  //不通过视图解析器，直接转发到页面
//	public String test2(Model model){
//		//转发
//		model.addAttribute("msg","ModelTest1");
//		return "forward:WEB-INF/jsp/test.jsp";
//	}
//
//	@RequestMapping("/t3")  //不通过视图解析器，直接重定向到页面
//	public String test3(Model model){
//		//重定向
//		model.addAttribute("msg","ModelTest2");
//		return "redirect:index.jsp";
//	}

	@RequestMapping("/t4")  //有视图解析器，转发直接写拼接的 关键字 部分就行
	public String test4(Model model){
		//转发
		model.addAttribute("msg","ModelTest2");
		return "test";
	}

	@RequestMapping("/t5")  //有视图解析器，通过 redirect 重定向到页面
	public String test5(Model model){
		//重定向
		model.addAttribute("msg","ModelTest2");
		return "redirect:/a.jsp";
	}
}
