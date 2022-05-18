package com.CTS.StripeRestAssuredAPI;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class DeletePayload {
	
	public static LinkedHashMap<String,Object> deletePayload(Object place_id ) throws Exception{
		
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		
		 map.put("place_id", place_id);
		 
		 return map;
	}

}
