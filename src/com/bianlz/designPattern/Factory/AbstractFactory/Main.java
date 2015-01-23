package com.bianlz.designPattern.Factory.AbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory wf = new WhiteFactory();
		Benz wbenz = wf.getBenz();
		BMW wbmw = wf.getBMW();
		System.out.println(wbenz.drive());
		System.out.println(wbmw.drive());
		CarFactory bf = new BlackFactory();
		Benz bbenz = bf.getBenz();
		BMW bbmw = bf.getBMW();
		System.out.println(bbenz.drive());
		System.out.println(bbmw.drive());
	}

}
