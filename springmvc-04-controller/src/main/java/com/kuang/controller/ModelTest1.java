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

//	@RequestMapping("/t1")  //��ͨ����ͼ��������Ҳ����ͨ��HttpServletRequest request, HttpServletResponse response ���ж����ת��
//	public String test1(HttpServletRequest request, HttpServletResponse response){
//		HttpSession session = request.getSession();
//		System.out.println(session.getId());
//
//		return "test";
//	}
//
//	@RequestMapping("/t2")  //��ͨ����ͼ��������ֱ��ת����ҳ��
//	public String test2(Model model){
//		//ת��
//		model.addAttribute("msg","ModelTest1");
//		return "forward:WEB-INF/jsp/test.jsp";
//	}
//
//	@RequestMapping("/t3")  //��ͨ����ͼ��������ֱ���ض���ҳ��
//	public String test3(Model model){
//		//�ض���
//		model.addAttribute("msg","ModelTest2");
//		return "redirect:index.jsp";
//	}

	@RequestMapping("/t4")  //����ͼ��������ת��ֱ��дƴ�ӵ� �ؼ��� ���־���
	public String test4(Model model){
		//ת��
		model.addAttribute("msg","ModelTest2");
		return "test";
	}

	@RequestMapping("/t5")  //����ͼ��������ͨ�� redirect �ض���ҳ��
	public String test5(Model model){
		//�ض���
		model.addAttribute("msg","ModelTest2");
		return "redirect:/a.jsp";
	}
}
