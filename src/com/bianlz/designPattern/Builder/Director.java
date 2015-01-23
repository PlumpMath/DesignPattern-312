package com.bianlz.designPattern.Builder;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	public Builder build(){
		builder.buildStepOne();
		builder.buildStepTwo();
		builder.buildStepThree();
		return builder;
	}
}
