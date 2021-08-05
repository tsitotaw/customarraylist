package com.tamirat.arraylist.custom;

import java.util.*;
public class CustomArrayListTest {

	public static void main(String[] args) {
		System.out.println("Hello Custom Array List");
		
		CArrayyList<Integer> custom1 = new CArrayyList<Integer>(4);
		
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
		
		
		Student[] students = new Student[3];
		
		students[0] = new Student("tamirat");
		students[1] = new Student("max");
		students[2] = new Student("even");
		
		
		System.out.println(custom1.toString());
		for(Student stud : students) {
			System.out.println(stud.toString());
		}
	}

}
