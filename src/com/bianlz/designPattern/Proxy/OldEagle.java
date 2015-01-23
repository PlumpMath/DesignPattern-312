package com.bianlz.designPattern.Proxy;

public class OldEagle implements Bird {
	private YoungEagle youngEagle;
	public OldEagle() {
		// TODO Auto-generated constructor stub
	}
	public OldEagle(YoungEagle youngEagle) {
		// TODO Auto-generated constructor stub
		this.youngEagle = youngEagle;
	}
	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("OldEagle hunting");
		youngEagle.hunt();
	}
}
