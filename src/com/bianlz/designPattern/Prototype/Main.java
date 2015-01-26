package com.bianlz.designPattern.Prototype;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Prototype vo = new Prototype();
		vo.setName("protoType");
		System.out.println(vo.clone().getName());
	}

}
