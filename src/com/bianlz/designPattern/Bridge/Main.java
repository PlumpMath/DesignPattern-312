package com.bianlz.designPattern.Bridge;

import java.util.Collection;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Communication email = new Email();
		email.setMessage(new Normal());
		email.send();
		
	}

}
