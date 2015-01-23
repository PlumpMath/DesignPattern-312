package com.bianlz.designPattern.Bridge;

public abstract class Communication {
	private Message message;

	public void setMessage(Message message) {
		this.message = message;
	}
	
	public void send(){
		System.out.print("use "+this.getClass().getSimpleName()+" to ");
		this.message.send();
	}
}
