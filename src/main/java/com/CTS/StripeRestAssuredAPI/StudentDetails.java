package com.CTS.StripeRestAssuredAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentDetails {

	public static void main(String[] args) throws JsonProcessingException {

		Map<String, Object> payload = new LinkedHashMap<String, Object>();
		
		payload.put("firstName", "kumar");
		
		payload.put("lastName", "sundar");
		
		payload.put("email", "kumar@gmail.com");
		
		List<Object> mobile = new ArrayList<Object>();
		
		mobile.add("1234567890");
		
		mobile.add("2468013579");
		
		payload.put("mobile", mobile);
		
		Map<String, Object> address = new HashMap<String, Object>();
		
		address.put("flatno", "A-131");
		
		address.put("city", "chennai");
		
		address.put("state", "tamilnadu");
		
		address.put("country", "India");
		
		payload.put("address", address);

		List<Object> secondarySkill = new ArrayList<Object>();

		secondarySkill.add("sheel Scripting");

		secondarySkill.add("machine learning");

		secondarySkill.add("AI");

		payload.put("secondarySkills", secondarySkill);

		List<Object> primarySkill = new ArrayList<Object>();

		primarySkill.add("c++");

		primarySkill.add("java");

		primarySkill.add("python");

		primarySkill.add("ruby");

		payload.put("primarySkills", primarySkill);

		Map<String, Object> education = new LinkedHashMap<String, Object>();

		Map<String, Object> BTechDetails = new LinkedHashMap<String, Object>();

		BTechDetails.put("course", "B.Tech");

		BTechDetails.put("marks", 75);

		Map<String, Object> MTechDetails = new LinkedHashMap<String, Object>();

		MTechDetails.put("course", "M.Tech");

		MTechDetails.put("marks", 80);

		List<Object> list = new ArrayList<Object>();

		list.add(BTechDetails);

		list.add(MTechDetails);

		education.put("education", list);

		payload.put("education", education);

		ObjectMapper objectMapper = new ObjectMapper();

		String data = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload);

		System.out.println(data);

	}

}
