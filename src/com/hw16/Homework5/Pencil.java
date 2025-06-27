package com.hw16.Homework5;

public class Pencil extends Pen{

	public Pencil() {
		super();
	}


	public Pencil(String brand, double price) {
		super(brand, price);
	}


	@Override
	void write() {
		System.out.println("削鉛筆再寫");
	}


	@Override
	public double getPrice() {
		return super.getPrice()*0.8;
	}

	@Override
	public void setPrice(double price) {
		super.setPrice(price);
	}

	
}
