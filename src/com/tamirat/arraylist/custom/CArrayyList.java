package com.tamirat.arraylist.custom;

public class CArrayyList {

	// we would like to provide an initial value for array size
	private int initialArrayLength = 10;
	private final static int ARRAY_LENGTH_INCREMENTOR = 10;
	private int[] list;
	private int nextIndex; //this helps us to know the next index to add neww value
	
	public CArrayyList(int arrayLength) {
		this.initialArrayLength = arrayLength;
		this.list = new int[this.initialArrayLength];
		this.nextIndex = 0;
	}
	
	public void add(int element) {
		// we would like to check if the next index is less than the array size
		if(this.nextIndex >= this.initialArrayLength){
			// we need to copy this array to a new one with a larger size first
			this.list = this.clone(list);
		}
		this.list[nextIndex] = element;
		this.nextIndex++;
	}
	
	private int[] clone(int[] existingArray) {
		//int newSize = existingArray.length + 1;//CArrayyList.ARRAY_LENGTH_INCREMENTOR;
		int[] newList = new int[existingArray.length + 1];
		for(int i=0; i < existingArray.length; i++) {
			newList[i] = existingArray[i];
		}
		return newList;
	}
	/**
	 * we would like to remove an element using a specific index
	 * this will require to check the existance of the index and to shift all the rest to the left
	 * but first we may want to see if the index is available
	 * @param index
	 */
	public void removeAt(int index) {
		if(!isIndexAvailable(index)) 
			throw new IndexOutOfBoundsException();
		
		int[] newList = new int[this.list.length -1];
		int newIndex = 0;
		for(int i=0; i< this.list.length; i++) {
			if(i == index) {
				continue;
			}
			newList[newIndex]= this.list[i];
			newIndex++;
		}
		
		this.list = newList;
	}

	private boolean isIndexAvailable(int index) {
		return (index < this.list.length) ? true : false;
	}
	
	public String toString() {
		String resultStmt = "";
		for(int element : this.list) {
			resultStmt += " "+ element;
		}
		return resultStmt;
	}

}
