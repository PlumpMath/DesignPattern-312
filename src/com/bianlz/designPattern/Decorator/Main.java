package com.bianlz.designPattern.Decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//装饰 模式   最佳实现例子：NIO    INPUTSTREAM
		Person person = new Person();
		IPerson ip = new PersonOne(new PersonTwo(new PersonThree(person)));
		ip.dress();
	}
}
