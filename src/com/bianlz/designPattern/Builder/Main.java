package com.bianlz.designPattern.Builder;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder adBuilder = new AdidasShoeBuilder();
		Builder nikeBuilder = new NikeShoeBuilder();
		ShoeBuilder builder = new ShoeBuilder(nikeBuilder);
		Shoe nikeShoe = builder.install().getShoe();
		System.out.println(" a "+ nikeShoe.getShoelace()+" "+ nikeShoe.getLogo()+" shoe");
		builder = new ShoeBuilder(adBuilder);
		Shoe adShoe = builder.install().getShoe();
		System.out.println(" a "+ adShoe.getShoelace()+" "+ adShoe.getLogo()+" shoe");
	}
}
