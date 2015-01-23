package com.bianlz.designPattern.Factory.AbstractFactory;

public class WhiteFactory implements CarFactory {
	public Benz getBenz(){
		return new WhiteBenz();
	}
	public BMW getBMW(){
		return new WhiteBMW();
	}
}
