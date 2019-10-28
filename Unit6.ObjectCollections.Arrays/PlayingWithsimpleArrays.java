package com.unit6.objectCollections;

public class PlayingWithsimpleArrays {

	public static void main(String[] args) {
		PlayingWithsimpleArrays simple = new PlayingWithsimpleArrays();
		//simple.declaringArraysOfNativeTypes();
		simple.accessingAndPlayingWithArrays();

	}
	
	//I've copyed pasted this funtion form unit 3 to show we have been using arrays.
	public int getOverallExamMark(int[] individualMarks) {
    	int sum = 0;
    	
    	for (int i = 0; i < individualMarks.length; i++) {
    		sum = sum + individualMarks[i]; 
    	}
    	return sum;
    }
	
	public void declaringArraysOfNativeTypes() /*IndexOutOfBoundsException*/ {
		int[] myIntArray;
		//instantiating the array
		myIntArray = new int[4];//size must be given during creation and can not be changed
		
		myIntArray[0] = 1; //arrays in java are zero based.
		
		
		
		try {
			int aux;
			aux = myIntArray[4];//will thorw IndexOut
		}catch (IndexOutOfBoundsException ioobe) {
			System.out.println(ioobe.toString());
			//throws ioobe;
		}
	}
	
	public void accessingAndPlayingWithArrays() {
		int[] myIntArray;
		//instantiating the array
		myIntArray = new int[4];//size must be given during creation and can not be changed
		
		myIntArray[0] = 1; //arrays in java are zero based.
		myIntArray[1] = 2;
		myIntArray[2] = 5;
		myIntArray[3] = 3;
		
		int targetNumber = 5;
		
		boolean found = this.findNumberInArray(myIntArray, targetNumber);
		System.out.println("Have I found it?"+found);
		int sum = this.itarateThroughAllAndSum(myIntArray);
		System.out.println("Total sum is:"+ sum);
		
	}

	private int itarateThroughAllAndSum(int[] myIntArray) {
		int totalSum = 0;
		for (int i = 0; i< myIntArray.length; i++) {
			totalSum = totalSum + myIntArray[i];
		}
		return totalSum;
		
		
		
	}

	//If you need to iterate an array, and know it is unlikely to 
	//hav to go through all the elements --> You should use a  while loop.
	private boolean findNumberInArray(int[] myIntArray, int targetNumber) {
		int index = 0;
		boolean found = false;
		
		while ((index < myIntArray.length) && (!found)){
			if (myIntArray[index] == targetNumber) {
				found = true;
			}
			index++;
		}
		return found;
	}

}
