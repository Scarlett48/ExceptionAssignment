package com.prac;

public class ArrayExceptionDemo {
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException{
		int arr[] = {11,22,33,44,55};
		int index = 6;
		
		try {
			System.out.println("Number at index 3 = " + arr[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught "+e);
		}
		finally {
			System.out.println("\nResetting index..");
			index = 2;
			System.out.println("Number at index 3 = " + arr[index]);
		}
	}
}
