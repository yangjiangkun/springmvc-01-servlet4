package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/h1")
	public String hello(Model model){
		model.addAttribute("msg","HelloAnnotationhhhhhhhhhhhhhhhhhh");
		return "hello";
	}

	@RequestMapping("/h2")
	public String hello1(Model model){
		model.addAttribute("msg","HelloAnnotationrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		return "hello";
	}
}
