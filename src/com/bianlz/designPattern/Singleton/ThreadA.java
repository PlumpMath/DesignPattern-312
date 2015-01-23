package com.bianlz.designPattern.Singleton;

public class ThreadA extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingletonClass single = SingletonClass.getInstance();
		single.setName("ThreadA");
		System.out.println(single.getName()+"TA");
	}

}
