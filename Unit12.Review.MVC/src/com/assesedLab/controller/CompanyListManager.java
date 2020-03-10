package com.assesedLab.controller;

import com.assesedLab.model.Company;
import com.assesedLab.model.CompanyList;

public class CompanyListManager {
	
	private CompanyList companyList;
	
	public CompanyListManager(int companyListSize) {
		this.companyList  = new CompanyList(companyListSize);
	}

	public void addCompany(Company b) {
		this.companyList.addCompany(b);
		
	}

	public Company[] getCompanys() {
		return this.companyList.getCompanys();
	}

	public void sort() {
		this.companyList.sort();
		
	}

}
