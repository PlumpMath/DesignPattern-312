package com.bianlz.designPattern.Decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//װ�� ģʽ   ���ʵ�����ӣ�NIO    INPUTSTREAM
		Person person = new Person();
		IPerson ip = new PersonOne(new PersonTwo(new PersonThree(person)));
		ip.dress();
	}
}
