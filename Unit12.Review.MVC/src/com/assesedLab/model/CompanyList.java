package com.assesedLab.model;

public class CompanyList {
	
	
	public CompanyList(int numOfCompany) {
		
		this.companys = new Company[numOfCompany];
		this.index =0;
	}
	
	
	private Company[] companys;
	private int index;
	public Company[] getCompanys() {
		return companys;
	}
	public void setCompanys(Company[] companys) {
		this.companys = companys;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public void sort() {
		InsertionSort.sort(this.companys);
		
	}
	
	public  void addCompany(Company a) {
		this.companys[this.index] = a;
		this.index++;
	}
	/*public String toString() {
		String companyDetails= new String();
		if(this.index!=0) {
			companyDetails=String.format("%-20s%-20\n","ANNUAL TURNOVER","COMPANY");
			for(int i=0; i<this.index; i++)
				companyDetails+=this.companys[i]+"\n";
		}
		else
			companyDetails+="Company list is empty";
		return companyDetails;
	}*/
	private boolean isCompanyUnique(Company a) {
		
		return false;
	}
	

}
