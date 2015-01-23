package com.bianlz.designPattern.Decorator;

public class PersonOne implements IPerson {
	private IPerson iperson;
	public PersonOne(IPerson iperson) {
		// TODO Auto-generated constructor stub
		this.iperson = iperson;
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("dress skirt!");
		iperson.dress();
	}

}
