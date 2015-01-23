package com.bianlz.designPattern.Proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//¿œ”•∞Ô–°”•≤∂¡‘
		Bird bird = new OldEagle(new YoungEagle());
		bird.hunt();
	}

}
