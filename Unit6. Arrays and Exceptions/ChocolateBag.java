package com.unit6.objectCollections;
import java.util.*;

public class ChocolateBag {
	private ArrayList<ChocolateCoin> bagContents;
	
	public ChocolateBag() {
		this.bagContents = new ArrayList<ChocolateCoin>();
	}
	
	public ChocolateBag(ArrayList<ChocolateCoin> _bagContents) {
		this.bagContents = _bagContents;
	}
	
	public int getNumberOfChocolates() {
		return this.bagContents.size();
	}
	
	public ChocolateCoin getOne() {
		ChocolateCoin ccoin = this.bagContents.get(0);
		this.bagContents.remove(0);
		return ccoin;
	}
}
