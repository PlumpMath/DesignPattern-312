package com.bianlz.designPattern.Builder;

public interface Builder {
	public void installShoelace();
	public void installSole();
	public void installVamp();
	public void installLogo();
	public Shoe getShoe();
}
