package com.bianlz.designPattern.Factory.FactoryMethod;

public class GlassCupFactory implements Factory {

	@Override
	public Cup getCup() {
		// TODO Auto-generated method stub
		return new GlassCup();
	}

}
