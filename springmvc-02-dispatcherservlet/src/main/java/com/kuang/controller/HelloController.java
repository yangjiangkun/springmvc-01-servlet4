package com.kuang.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//ע�⣺���������ȵ���Controller�ӿ�
public class HelloController implements Controller {


	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//ModelAndView ģ�ͺ���ͼ
		ModelAndView mv = new ModelAndView();


		//��װ���󣬷���ModelAndView�С�Model
		mv.addObject("msg","HelloSpringMVC!");
		//��װҪ��ת����ͼ������ModelAndView��
		mv.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp
		return mv;
	}

}