package com.tnsif.day5.inheritance.multilevel;

public class City extends State {
	private String cityName;
	private Float area;
	
	
	

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Float getArea() {
		return area;
	}

	public void setArea(Float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", StateName=" + getStateName()
				+ ", Langauage=" + getLangauage() + ", CountryName=" + getCountryName() + ", Capital="
				+ getCapital() + "]";
	}

}
