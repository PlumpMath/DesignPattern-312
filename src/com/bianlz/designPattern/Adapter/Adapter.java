package com.bianlz.designPattern.Adapter;

public class Adapter implements NewTarget {
	private OldTarget oldTarget;
	public Adapter(OldTarget oldTarget) {
		// TODO Auto-generated constructor stub
		this.oldTarget = oldTarget;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		oldTarget.doOldThings();
	}

}
