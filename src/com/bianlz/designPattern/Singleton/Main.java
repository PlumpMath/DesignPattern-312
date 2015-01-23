package com.bianlz.designPattern.Singleton;

public class Main {
	public static void main(String[] args){
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
		try {
			ta.join();
			tb.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
