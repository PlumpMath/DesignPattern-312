package com.bianlz.designPattern.Factory.SimpleStaticFactory;

public class ProductFactory {
	public static Product getProduct(String type){
		Product p = null;
		if("1".equals(type)){
			p = new Prod1();
		}else if("2".equals(type)){
			p = new Prod2();
		}else{
			p = null;
		}
		return p;
	}
}
