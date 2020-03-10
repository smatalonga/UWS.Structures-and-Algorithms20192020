package com.assesedLab.model;

public class Company implements Comparable{
	public Company(String name2, int turnover2) {
		
		this.name=name2;
		this.turnover=turnover2;
		
	}
	
	private String name;
	private int turnover;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	public String toString() {
		String companyDetails=new String();
		companyDetails=String.format("%-20s%-20s","ANNUAL TURNOVER	:"+ turnover,"  COMPANY    :"+name);
		
		return companyDetails;
	}
	public int compareTo(Object arg0) {
		
		Company aux = (Company) arg0;
		int answer = this.turnover - aux.getTurnover();
		if (answer == 0) {
			answer = this.name.compareToIgnoreCase(aux.getName());
		}
		else if (answer > 0) {
			answer = 1;
		}
		else {
			answer = -1;
		}
		return answer;
}

}
