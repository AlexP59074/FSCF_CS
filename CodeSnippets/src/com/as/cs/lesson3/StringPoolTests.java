package com.as.cs.lesson3;

public class StringPoolTests {
	public static void main (String []args){
		String one = "abc";
		String two = "abc";
		Integer three = 99;
		System.out.println("one " + one.hashCode()); // .hashcode grabs the String pool memory location of the string and writes it out.
		System.out.println("two " + two.hashCode());
		
		System.out.println("one " + one.toString());
		System.out.println("two " + two.toString());
		System.out.println("three " + three.toString()); // Converts the Integer 99 to a String value.
		
	}
	

}
