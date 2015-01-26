package com.bianlz.designPattern.Builder;

public class NikeShoeBuilder implements Builder {
	private Shoe shoe;
	public NikeShoeBuilder(){
		shoe = new NikeShoe();
	} 
	
	@Override
	public void installShoelace() {
		// TODO Auto-generated method stub
		shoe.setShoelace("red shoelace");
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
		shoe.setLogo("NIKE");
	}

	public Shoe getShoe() {
		return shoe;
	}

	
	
	
}
