package com.bianlz.designPattern.Singleton;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SingletonClass single = SingletonClass.getInstance();
		single.setName("ThreadB");
		System.out.println(single.getName()+"TB");
	}

}
