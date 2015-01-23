package com.bianlz.designPattern.Prototype;

public class Prototype implements Cloneable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Prototype clone()throws CloneNotSupportedException {
		return (Prototype)super.clone();
	}
	

}
