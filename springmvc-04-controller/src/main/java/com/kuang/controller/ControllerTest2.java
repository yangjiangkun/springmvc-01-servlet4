package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//代表这个类会被spring接管，被这个注解的类，中所有方法，如果返回值是String，并且有具体的页面可以跳转，那么就会被视图解析器解析
@Controller
public class ControllerTest2 {

	@RequestMapping("/t2")
	public String test2(Model model){
		model.addAttribute("msg","ControllerTest2");
		return "test";
	}

	//只要改了java代码就 Redeploy 一下 重新发布会重新打包，不会重启tomcat
	//只要改了配置文件就重启tomcat
	//只要改了前端代码就刷新页面
	@RequestMapping("/t3")
	public String test3(Model model){
		model.addAttribute("msg","Test3");
		return "test";
	}


}
