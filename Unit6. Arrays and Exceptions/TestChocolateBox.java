package com.unit6.objectCollections;

public class TestChocolateBox {
	public static void main(String args[]) throws Exception {
		ChocolateBox myCB = new ChocolateBox();
		
		ChocolateCoin cc = myCB.getOne(5);
		//System.out.println(cc);
		
		/*	
		try{
			cc = myCB.getOne(10);
			System.out.println(cc);
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			//aiobe.toString();
			//aiobe.printStackTrace();
			System.out.println("OOps! I found and exception -> ArrayIndexOutOfBoundsException ");
		}*/
		
		try {	
			cc = myCB.getOne(-1);
			System.out.println(cc);
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
		//aiobe.toString();
		//aiobe.printStackTrace();
			System.out.println("OOO I found and exception -> ArrayIndexOutOfBoundsException ");
		}
		catch(IllegalArgumentException iae) {
			System.out.println("OOO I found and exception -> IllegalArgumentException ");
		}
		catch (ChocolateBoxException cbe){
			System.out.println("OOO I found and exception -> Exception ChocolateBox");
			
		}
		catch(Exception e) {
			System.out.println("OOO I found and exception -> Exception ");
		}
		finally{
			System.out.println("This should always get executed");
		}
		
		
		//throw new Exception("I broke my code!");
		
	}
	
	
	public void ExeplifyExplicitManagmentofExceptions() throws ChocolateBoxException {
		ChocolateBox myCB = new ChocolateBox();
		
		ChocolateCoin cc = myCB.getOne(5);
		System.out.println(cc);
	}
}
