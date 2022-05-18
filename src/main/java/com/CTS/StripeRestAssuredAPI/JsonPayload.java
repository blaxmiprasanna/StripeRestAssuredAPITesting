package com.CTS.StripeRestAssuredAPI;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonPayload {
	
	public static JSONObject jsonPayloadObject() throws Exception{
		
		ReadPayLoadData readData=new ReadPayLoadData();
		
		readData.readExcelData("TestCase14");
		
		JSONObject jsonObject = new JSONObject();
		
		JSONObject location = new JSONObject();
		location.put("lat", ReadPayLoadData.pojoClass.latitude);
		location.put("lng", ReadPayLoadData.pojoClass.longitude);
		jsonObject.put("location", location);
		
		jsonObject.put("accuracy", 60);
		jsonObject.put("name", ReadPayLoadData.pojoClass.name);
		jsonObject.put("phone_number", ReadPayLoadData.pojoClass.phone_number);
		jsonObject.put("address", ReadPayLoadData.pojoClass.address);
		
		JSONArray jsonArray=new JSONArray();
		jsonArray.put(ReadPayLoadData.pojoClass.type1);
		jsonArray.put(ReadPayLoadData.pojoClass.type2);
		jsonObject.put("types", jsonArray);
		
		jsonObject.put("website", "http://rahulshettyacademy.com");
		jsonObject.put("language", ReadPayLoadData.pojoClass.language);
		
		return jsonObject;
		
	}

}
