package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@Controller
public class EncodingController {

	//¹ýÂËÆ÷½â¾öÂÒÂë
	@PostMapping("/e/t1")
	public String test1(Model model, String name){
		model.addAttribute("msg",name);

		return "test";
	}

}

