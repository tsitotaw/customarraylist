package com.tamirat.arraylist.custom;

public class CustomArrayListTest {

	public static void main(String[] args) {
		System.out.println("Hello Custom Array List");
		
		CArrayyList custom1 = new CArrayyList(4);
		
		custom1.add(1);
		custom1.add(2);
		custom1.add(3);
		custom1.add(4);
		custom1.add(5);
		custom1.add(6);
		custom1.add(7);
		custom1.add(8);
		custom1.add(9);
		
		
		custom1.removeAt(4);
		custom1.removeAt(2);
		custom1.removeAt(5);
		
		System.out.println(custom1.toString());
	}

}
