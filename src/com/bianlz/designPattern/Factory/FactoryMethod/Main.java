package com.bianlz.designPattern.Factory.FactoryMethod;

public class Main {
	public static void main(String[] args){
		Cup c = null;
		c = (new GlassCupFactory()).getCup();
		System.out.println(c.say());
		c = (new IronCupFactory()).getCup();
		System.out.println(c.say());
	}
}
