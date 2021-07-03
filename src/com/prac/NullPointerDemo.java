package com.prac;

public class NullPointerDemo {
	public void method2() throws NullPointerException{
		throw new NullPointerException();
	}
	
	public void method1() throws CustomNullPointerException{
		try {
			method2();
		} catch (NullPointerException e) {
			throw new CustomNullPointerException();
		}
		
	}
	
	public static void main(String args[]) {
		NullPointerDemo obj = new NullPointerDemo();
		try {
			obj.method1();
		} catch(Exception e) {
			System.out.println(e.getClass()+":"+e.getMessage());
		}
	}
}
