package com.dm.collections;

public class Student implements Comparable{
	
	String firstName;
	String lastName;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public boolean equals(Student student1) {
		if (this.firstName.equals(student1.firstName)&& this.firstName.equals(student1.lastName)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Object student1) {
		return this.lastName.compareTo(((Student)student1).lastName);
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
}
