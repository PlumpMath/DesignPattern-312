package com.bianlz.designPattern.Singleton;

public  class SingletonClass {
	private static volatile SingletonClass single ;
	private String name ;
	private SingletonClass(){}
	public static SingletonClass getInstance(){
		if(single==null){
			synchronized (SingletonClass.class) {
				if(single==null){
					single = new SingletonClass();
				}
			}
		}
		return single;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
