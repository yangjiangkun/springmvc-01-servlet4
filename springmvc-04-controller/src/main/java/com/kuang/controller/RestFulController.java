package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

	//ԭ���ķ�� http://localhost:8080/add?a=1&b=2
	@RequestMapping("/add")
	public String test1(int a,int b,Model model){
		int res = a + b;
		model.addAttribute("msg","���Ϊ1=" + res);
		return "test";
	}

	//RestFul ������@PathVariable  http://localhost:8080/add/1/2
	@RequestMapping("/add1/{a}/{b}")
	public String test2(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","���Ϊ2=" + res);
		return "test";
	}

	//RestFul �����  �������������
	@RequestMapping(value = "/add2/{a}/{b}",method = RequestMethod.GET)
	public String test3(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","���Ϊ3=" + res);
		return "test";
	}


	//RestFul �����  ��д���������
	@GetMapping("/add3/{a}/{b}")
	public String test4(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","���Ϊ4=" + res);
		return "test";
	}

	//����·��һ�������������Ͳ�һ�������п��Է��ʵ�   Post�ύ����ҳ�棺http://localhost:8080/a.jsp
	@PostMapping("/add3/{a}/{b}")
	public String test5(@PathVariable int a, @PathVariable int b, Model model){
		int res = a + b;
		model.addAttribute("msg","���Ϊ5=" + res);
		return "test";
	}

}
