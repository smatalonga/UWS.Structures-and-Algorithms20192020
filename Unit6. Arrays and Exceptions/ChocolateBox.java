package com.unit6.objectCollections;


public class ChocolateBox {
	private ChocolateCoin[] boxContents;
	
	public ChocolateBox() {
		boxContents = new ChocolateCoin[10];
		boxContents[0] = new ChocolateCoin("Red", 1);
		boxContents[1] = new ChocolateCoin("Red", 2);
		boxContents[2] = new ChocolateCoin("Red", 3);
		boxContents[3] = new ChocolateCoin("Red", 4);
		boxContents[4] = new ChocolateCoin("Red", 5);
		boxContents[5] = new ChocolateCoin("Red", 6);
		boxContents[6] = new ChocolateCoin("Red", 7);
		boxContents[7] = new ChocolateCoin("Red", 10);
		boxContents[8] = new ChocolateCoin("Red", 8);
		boxContents[9] = new ChocolateCoin("Red", 9);
		
		
		
	}
	
	public ChocolateBox(ChocolateCoin[] loadBoxContents) {
		this.boxContents = loadBoxContents;
	}
	
	public int getNumberOfChocolates() {
		return this.boxContents.length;
	}
	
	public ChocolateCoin getOne(int whichChocolate) throws ChocolateBoxException {
		if (whichChocolate < 0) {
			throw new ChocolateBoxException();
		}
		
		ChocolateCoin ccoin = this.boxContents[whichChocolate];
		this.boxContents[whichChocolate] = null;
		return ccoin;
	}
}
 