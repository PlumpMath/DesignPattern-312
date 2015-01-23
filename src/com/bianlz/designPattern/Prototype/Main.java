package com.bianlz.designPattern.Prototype;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Prototype vo = new Prototype();
		for(int i=0;i<10;i++){
			vo.clone();
		}
	}

}
