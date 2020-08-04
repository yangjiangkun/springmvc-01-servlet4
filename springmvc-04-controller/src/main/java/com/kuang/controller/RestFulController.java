package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

	//原来的风格 http://localhost:8080/add?a=1&b=2
	@RequestMapping("/add")
	public String test1(int a,int b,Model model){
		int res = a + b;
		model.addAttribute("msg","结果为1=" + res);
		return "test";
	}

	//RestFul 风格添加@PathVariable  http://localhost:8080/add/1/2
	@RequestMapping("/add1/{a}/{b}")
	public String test2(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","结果为2=" + res);
		return "test";
	}

	//RestFul 风格添  定义请求的类型
	@RequestMapping(value = "/add2/{a}/{b}",method = RequestMethod.GET)
	public String test3(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","结果为3=" + res);
		return "test";
	}


	//RestFul 风格添  简写请求的类型
	@GetMapping("/add3/{a}/{b}")
	public String test4(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","结果为4=" + res);
		return "test";
	}

	//请求路径一样但是请求类型不一样，还有可以访问的   Post提交数据页面：http://localhost:8080/a.jsp
	@PostMapping("/add3/{a}/{b}")
	public String test5(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","结果为5=" + res);
		return "test";
	}

}
