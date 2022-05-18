package com.CTS.StripeRestAssuredAPI;

public class PojoClass {

	// TestCaseName UserName Password NROAccount# NREAccount# Routine# FirstName
	// LastName Amount MoneyType

	String testCase;
	double latitude;
	double longitude;
	int accuracy;
	String name;
	String phone_number;
	String address;
	String type1;
	String type2;
	String language;
	
	public String getTestCase() {
		return testCase;
	}
	
	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(double d) {
		this.latitude = d;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getType1() {
		return type1;
	}
	
	public void setType1(String type1) {
		this.type1 = type1;
	}
	
	public String getType2() {
		return type2;
	}
	
	public void setType2(String type2) {
		this.type2 = type2;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
}
