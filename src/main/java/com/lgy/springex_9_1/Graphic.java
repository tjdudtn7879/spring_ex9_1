package com.lgy.springex_9_1;

public class Graphic {
	String company;
	int capRank;
	
	public void getGraphicInfo() {
		System.out.println("회사 : "+getCompany());
		System.out.println("시총 : "+getCapRank());
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCapRank() {
		return capRank;
	}
	public void setCapRank(int capRank) {
		this.capRank = capRank;
	}
	
	
}
