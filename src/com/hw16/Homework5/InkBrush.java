package com.hw16.Homework5;

public class InkBrush extends Pen{

	public InkBrush() {
		super();
	}
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	@Override
	void write() {
		System.out.println("沾墨汁再寫");
	}
	@Override
	public double getPrice() {
		return super.getPrice()*0.9;
	}


	


	
}
