package com.bianlz.designPattern.Decorator;

public class PersonTwo implements IPerson {
	private IPerson iperson;
	public PersonTwo(IPerson iperson) {
		// TODO Auto-generated constructor stub
		this.iperson = iperson;
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("dress T-shirt!");
		iperson.dress();
	}

}
