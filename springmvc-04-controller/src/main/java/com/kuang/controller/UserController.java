package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	//localhost:8080/user/t1?username=xxx
	@GetMapping("/t1")
	public String test1(@RequestParam("username") String name,Model model){
		//1.����ǰ�˲���
		System.out.println("���յ�ǰ�˵Ĳ���Ϊ��"+name);
		//2.�����صĽ�����ݸ�ǰ�� �� Model
		model.addAttribute("msg",name);
		//3.��ͼ��ת
		return "test";
	}

	/*
	1.����ǰ���û����ݵĲ������жϲ��������֣���������ֱ���ڷ����ϣ�����ֱ��ʹ��
	2.���贫�ݵ���һ������User��ƥ��User�����е��ֶ������������һ����OK,����ƥ�䲻��������ΪNULL
	*/
	@GetMapping("/t2")
	public String test2(User user){
		System.out.println(user);

		return "test";
	}



}
