package com.lgy.springex_9_1;

public class Car {
	String company,product;
	int capRank;
	
	public void getCarInfo() {
		System.out.println("회사 : "+getCompany());
		System.out.println("시총 : "+getCapRank());
		System.out.println("모델 : "+getProduct());
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getCapRank() {
		return capRank;
	}
	public void setCapRank(int capRank) {
		this.capRank = capRank;
	}
	
	
}
