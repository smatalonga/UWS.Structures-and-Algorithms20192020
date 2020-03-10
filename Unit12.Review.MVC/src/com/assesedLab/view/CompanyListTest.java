package com.assesedLab.view;

import com.assesedLab.controller.CompanyListManager;
import com.assesedLab.model.Company;
import com.assesedLab.model.CompanyList;

public class CompanyListTest {

	public static void main(String[] args) {
		
		int listSize = askTheuserForCompanyListSize();
		CompanyListManager controller = new CompanyListManager(listSize);
		
		
		int userInput = -1;
		do {
			showMenu();
			//userInput=askTheUserForInput();
			userInput = safeAskTheUserForInput();
			evaluateUserInput(userInput, controller);
			
		}while(userInput != 10);
	}

	private static int askTheuserForCompanyListSize() {
		int numberOfCompanies = Input.getInteger("Please input the number of companies:" );
		return numberOfCompanies;
	}

	private static int askTheUserForInput() {
		int askTheUserForInput=Input.getInteger("Please choose your option: ");// TODO Auto-generated method stub
		return askTheUserForInput;
	}
	
	private static int safeAskTheUserForInput() {
		int userInput = -1;
		try {
			userInput=Input.getInteger("Please choose your option: ");// TODO Auto-generated method stub
		}
		catch(NumberFormatException nfe) {
			userInput = -1;
		}
		return userInput;
		
	}

	private static void showMenu() {
		System.out.println("(1) Add company to list");
		System.out.println("(2) Display the company");
		System.out.println("(3) Display the company");
		System.out.println("(10) Quit");
	}

	private static void evaluateUserInput(int userInput, CompanyListManager controller) {
		switch (userInput) {
			case 1:
				addCompanyToList(controller);
				break;
			case 2:
				
				displayList(controller);
			
				break;
			case 3:
				sort(controller);
				break;
			case 10:
				System.out.println("Shutting down...");
				break;
			default:
				System.out.println("Please choose valid option");
			
		}
	}
		

	

	private static void sort(CompanyListManager controller) {
		controller.sort();// TODO Auto-generated method stub
		
	}

	public static void addCompanyToList(CompanyListManager controller) {

		String name = Input.getString("Please enter the company");
		int turnover = Input.getInteger("Please enter the turnover(to the nearest million)");

		Company b = new Company(name, turnover);
		controller.addCompany(b);
	}

	public static void displayList(CompanyListManager controller) {
		Company[] list = controller.getCompanys();
		
		
		for (int i = 0; i < list.length; i++) {
			Company aux = list[i];
			if (aux != null) {
				System.out.println(aux.toString());
			}
			else
				System.out.println("Company list is empty");

		}
	}
}
