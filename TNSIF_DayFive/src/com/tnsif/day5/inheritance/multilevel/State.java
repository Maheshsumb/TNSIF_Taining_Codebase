package com.tnsif.day5.inheritance.multilevel;

public class State extends Country {

	private String stateName;
	private String langauage;

	
	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getLangauage() {
		return langauage;
	}

	public void setLangauage(String langauage) {
		this.langauage = langauage;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", langauage=" + langauage + ", CountryName()=" + getCountryName()
				+ ", Capital()=" + getCapital() + "]";
	}

}
