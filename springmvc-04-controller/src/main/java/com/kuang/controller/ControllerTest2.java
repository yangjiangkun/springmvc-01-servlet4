package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//���������ᱻspring�ӹܣ������ע����࣬�����з������������ֵ��String�������о����ҳ�������ת����ô�ͻᱻ��ͼ����������
@Controller
public class ControllerTest2 {

	@RequestMapping("/t2")
	public String test2(Model model){
		model.addAttribute("msg","ControllerTest2");
		return "test";
	}

	//ֻҪ����java����� Redeploy һ�� ���·��������´������������tomcat
	//ֻҪ���������ļ�������tomcat
	//ֻҪ����ǰ�˴����ˢ��ҳ��
	@RequestMapping("/t3")
	public String test3(Model model){
		model.addAttribute("msg","Test3");
		return "test";
	}


}
