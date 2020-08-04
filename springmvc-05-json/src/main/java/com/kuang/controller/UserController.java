package com.kuang.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import javafx.scene.chart.PieChart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

//@Controller
@RestController   //????????@Controller ???????????????@ResponseBody,???????????????????????????????§Ö??????????????
public class UserController {

	@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")  //??????json?????????
	//@ResponseBody  //????ResponseBody??????????????????????????????????
	public String json1() throws JsonProcessingException {

		//jackson  ObjectMappper
		ObjectMapper mapper = new ObjectMapper();

		//???????????
		User user = new User("???1??",3,"??");

		String str = mapper.writeValueAsString(user);

		return str;
	}

	@RequestMapping("/j2")
	//@ResponseBody  //????ResponseBody??????????????????????????????????
	public String json2() throws JsonProcessingException {

		//jackson  ObjectMappper
		ObjectMapper mapper = new ObjectMapper();

		//???????????
		User user = new User("???1??",3,"??");

		String str = mapper.writeValueAsString(user);

		return str;
	}



	@RequestMapping("/j3")
	public String json3() throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		List<User> userList = new ArrayList<User>();

		User user1 = new User("???1??",3,"??");
		User user2 = new User("???1??",3,"??");
		User user3 = new User("???1??",3,"??");
		User user4 = new User("???1??",3,"??");

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);

		String str = mapper.writeValueAsString(userList);

		return str;
	}


	@RequestMapping("/j4")
	public String json4() throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		Date date = new Date();

		//ObjectMapper ?????????????????Timestamp ????
		return mapper.writeValueAsString(date);
	}


	@RequestMapping("/j5")
	public String json5() throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		Date date = new Date();

		//????????????
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		//ObjectMapper ?????????????????Timestamp ????
		return mapper.writeValueAsString(sdf.format(date));
	}

	@RequestMapping("/j6")
	public String json6() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		//?????????????
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		//???????????????
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//?????????
		mapper.setDateFormat(sdf);

		Date date = new Date();
		String str = mapper.writeValueAsString(date);

		//ObjectMapper ?????????????????Timestamp ????
		return mapper.writeValueAsString(sdf.format(date));
	}


	@RequestMapping("/j7")
	public String json7() throws JsonProcessingException {

		Date date = new Date();

		return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
	}

	@RequestMapping("/j8")
	public String json8() throws JsonProcessingException {

		Date date = new Date();

		return JsonUtils.getJson(date);
	}

	@RequestMapping("/j9")
	public String json9() throws JsonProcessingException {

		List<User> userList = new ArrayList<User>();

		User user1 = new User("???1??",3,"??");
		User user2 = new User("???1??",3,"??");
		User user3 = new User("???1??",3,"??");
		User user4 = new User("???1??",3,"??");

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);

		return JsonUtils.getJson(userList);
	}

	@RequestMapping("/j10")
	public String json10() throws JsonProcessingException {

		List<User> userList = new ArrayList<User>();

		User user1 = new User("???1??",3,"??");
		User user2 = new User("???1??",3,"??");
		User user3 = new User("???1??",3,"??");
		User user4 = new User("???1??",3,"??");

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);

		String string = JSON.toJSONString(userList);
		return string;
	}

	@RequestMapping("/j11")
	public String json11() throws JsonProcessingException {

		List<User> userList = new ArrayList<User>();

		User user1 = new User("???1??",3,"??");
		User user2 = new User("???1??",3,"??");
		User user3 = new User("???1??",3,"??");
		User user4 = new User("???1??",3,"??");

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);

		System.out.println("*******Java???? ? JSON?????*******");
		String str1 = JSON.toJSONString(userList);
		System.out.println("JSON.toJSONString(list)==>"+str1);
		String str2 = JSON.toJSONString(user1);
		System.out.println("JSON.toJSONString(user1)==>"+str2);

		System.out.println("\n****** JSON????? ? Java????*******");
		User jp_user1=JSON.parseObject(str2,User.class);
		System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

		System.out.println("\n****** Java???? ? JSON???? ******");
		JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
		System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

		System.out.println("\n****** JSON???? ? Java???? ******");
		User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
		System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);

		return "hello";
	}
}
