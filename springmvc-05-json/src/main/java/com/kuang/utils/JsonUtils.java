package com.kuang.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtils {

	public static String getJson(Object object) {
		return getJson(object,"yyyy-MM-dd HH:mm:ss");
	}

	public static String getJson(Object object,String dateFormat) {
		ObjectMapper mapper = new ObjectMapper();
		//��ʹ��ʱ���ķ�ʽ
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		//�Զ������ڸ�ʽ����
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		//ָ�����ڸ�ʽ
		mapper.setDateFormat(sdf);
		try {
			return mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}