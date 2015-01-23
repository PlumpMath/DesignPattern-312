package com.bianlz.designPattern.Factory.FactoryMethod;

public class IronCupFactory implements Factory {

	@Override
	public Cup getCup() {
		// TODO Auto-generated method stub
		return new IronCup();
	}

}
