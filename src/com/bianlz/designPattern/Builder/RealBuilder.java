package com.bianlz.designPattern.Builder;

public class RealBuilder implements Builder {
	private String flag="";
	@Override
	public void buildStepOne() {
		// TODO Auto-generated method stub
		flag +="1";
		System.out.println("build 1");
	}

	@Override
	public void buildStepTwo() {
		// TODO Auto-generated method stub
		flag +="2";
		System.out.println("build 2");
	}

	@Override
	public void buildStepThree() {
		// TODO Auto-generated method stub
		flag +="3";
		System.out.println("build 3");
	}

	@Override
	public void getResult() {
		// TODO Auto-generated method stub
		if("123".equals(flag)){
			System.out.println("build finish");
		}
	}

}
