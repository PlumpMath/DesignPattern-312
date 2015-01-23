package com.bianlz.designPattern.Builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new RealBuilder();
		Director director = new Director(builder);
		director.build();
		builder.getResult();
	}

}
