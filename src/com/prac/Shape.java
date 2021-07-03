package com.prac;

public class Shape {
	double length;
	double width;
	
	Shape(double length, double width){
		this.length = length;
		this.width = width;
		

	}
	
	public void isSquare() throws NotASquareException{
		if(length != width)
			throw new NotASquareException();
	}
	
	public static void main(String args[]) {
		Shape shapeObj = new Shape(6,4);
		
		try{
            shapeObj.isSquare();
        } catch (Exception e){
            System.out.println(e.getClass()+":"+e.getMessage());
        }
		
	}
}
