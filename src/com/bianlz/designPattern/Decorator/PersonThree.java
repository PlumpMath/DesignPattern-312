package com.bianlz.designPattern.Decorator;

public class PersonThree implements IPerson {
	private IPerson iperson;
	public PersonThree(IPerson iperson) {
		// TODO Auto-generated constructor stub
		this.iperson = iperson;
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("dress Man's suit!");
		iperson.dress();
	}

}
