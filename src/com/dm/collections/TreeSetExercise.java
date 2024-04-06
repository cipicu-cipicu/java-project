package com.dm.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExercise {
	public static void main(String[] args) {
		HashSet<Student> set1 = new HashSet<Student>();
		
		Student sam = new Student("Sam", "Green");
		Student john = new Student("John", "Smith");
		Student alexia = new Student("Alexia", "Brown");
		
		set1.add(sam);
		set1.add(john);
		set1.add(alexia);
//		set1.add(john);
		
		System.out.println(set1);
	}
}
