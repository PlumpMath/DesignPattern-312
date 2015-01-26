package com.bianlz.designPattern.Builder;

public class ShoeBuilder {
	private Builder builder ;
	public ShoeBuilder(Builder builder){
		this.builder = builder;
	}
	public Builder install(){
		builder.installShoelace();
		builder.installSole();
		builder.installVamp();
		builder.installLogo();
		return builder;
	}
}
