package com.bianlz.designPattern.Factory.AbstractFactory;

public class BlackFactory implements CarFactory {

	@Override
	public Benz getBenz() {
		// TODO Auto-generated method stub
		return new BlackBenz();
	}

	@Override
	public BMW getBMW() {
		// TODO Auto-generated method stub
		return new BlackBMW();
	}

}
