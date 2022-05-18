package com.CTS.StripeRestAssuredAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import utilityClass.HelperClass;

public class PayloadToCreatePostRequest {
	
	public static String postRequest() throws Exception {

		RestAssured.baseURI = HelperClass.readDataFromPropertyFile().getBaseURL();
		
		ReadPayLoadData readData=new ReadPayLoadData();
		
		readData.readExcelData("TestCase14");
		
		LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();
		
		LinkedHashMap<Object, Object> location = new LinkedHashMap<Object, Object>();
		location.put("lat", ReadPayLoadData.pojoClass.latitude);
		location.put("lng", ReadPayLoadData.pojoClass.longitude);
		map.put("location", location);

		map.put("accuracy", ReadPayLoadData.pojoClass.accuracy);
		map.put("name", ReadPayLoadData.pojoClass.name);
		map.put("phone_number", ReadPayLoadData.pojoClass.phone_number);
		map.put("address", ReadPayLoadData.pojoClass.address);
		
		ArrayList<String> list=new ArrayList<String>();
		list.add(ReadPayLoadData.pojoClass.type1);
		list.add(ReadPayLoadData.pojoClass.type2);
		
		map.put("types", list);
		map.put("website", "http://rahulshettyacademy.com");
		map.put("language", ReadPayLoadData.pojoClass.language);
		
		ObjectMapper objectMapper = new ObjectMapper();

		String data = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		
//		System.out.println(data);
		return data;
	}
}
