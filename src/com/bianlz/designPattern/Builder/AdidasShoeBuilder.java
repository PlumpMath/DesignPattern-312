package com.bianlz.designPattern.Builder;

public class AdidasShoeBuilder implements Builder {
	private Shoe shoe;
	public AdidasShoeBuilder() {
		// TODO Auto-generated constructor stub
		shoe = new AdidasShoe();
	}
	@Override
	public void installShoelace() {
		// TODO Auto-generated method stub
		shoe.setShoelace("blue shoelace");
	}

	@Override
	public void installSole() {
		// TODO Auto-generated method stub
		shoe.setSole("comfortable sole");
	}

	@Override
	public void installVamp() {
		// TODO Auto-generated method stub
		shoe.setVamp("black vamp");
	}

	@Override
	public void installLogo() {
		// TODO Auto-generated method stub
		shoe.setLogo("ADIDAS");
	}
	
	public Shoe getShoe() {
		return shoe;
	}
	
	
	
	
	
}
