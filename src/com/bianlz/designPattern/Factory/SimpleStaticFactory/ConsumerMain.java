package com.bianlz.designPattern.Factory.SimpleStaticFactory;

public class ConsumerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = ProductFactory.getProduct("1");
		p.say();
	}

}
