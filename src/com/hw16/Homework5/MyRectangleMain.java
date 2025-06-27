package com.hw16.Homework5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle();
		MyRectangle r2 = new MyRectangle(10,20);
		r1.setDepth(20);
		r1.setWidth(10);
		double area1 = r1.getArea();
		double area2 = r2.getArea();
		System.out.println(area1);
		System.out.println(area2);
	}

}
