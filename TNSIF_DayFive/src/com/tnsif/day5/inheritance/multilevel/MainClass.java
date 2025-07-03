package com.tnsif.day5.inheritance.multilevel;

public class MainClass {
	
	public static void main(String[] args) {
		
		City city = new City();
		
		city.setCityName("Pune");
		city.setArea(564615.595f);
		city.setStateName("Maharashtra");
		city.setLangauage("Marathi");
		city.setCountryName("India");
		city.setCapital("Delhi");
		System.out.println(city);
	}

}
