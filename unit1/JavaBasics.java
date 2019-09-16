package com.uws.sya.unit1;

public class JavaBasics {
	
	public static String myStringClassVariables = "hello, world on 16/09/2019";
	
	
	public static void main(String[] args) {
	    System.out.println(myStringClassVariables);
	
	    /* Variables */
        int myIntVariable = 9;
        System.out.println(myIntVariable);
        Integer myIntegerVariable = 3;
        System.out.println(myIntegerVariable);
        // End Variables */
        
        /* boxing */
        
        double myVar;
        Double myOtherVar;
        
        myVar = 3.2;
        //myOtherVar = new Double("3.4");
        //myOtherVar = new Double(3.4);
        myOtherVar = new Double(myVar);
        myOtherVar = myVar;
        
        
        
        System.out.println("myVar = "+myVar+ "; myOtherVar = "+myOtherVar);
        
        //boolean aux = (myOtherVar > 2.0);
        int theIntValueofADouble = myOtherVar.intValue();//Unboxing 
        System.out.println("Int value ="+theIntValueofADouble);
        
        
        theIntValueofADouble = (int) Math.round(myOtherVar); 
        System.out.println("Int rounded value ="+theIntValueofADouble);
        		
        //End Boxing
        
        
        /* Operators */
        
        System.out.println("Operators");
        int someIntVariable = 9;
        int someOtherIntVariable = 3;
        
        int wholeNumberDivision = someIntVariable / someOtherIntVariable;
        System.out.println(wholeNumberDivision);
        
        double resultWithDecimals = 8 / 3;
        System.out.println(resultWithDecimals);
        int remainder = 9%3;
        System.out.println(remainder);
        
        
        String userInput = Input.getString("Type anything:" );
        System.out.println(" "+userInput);
        
	}

}

