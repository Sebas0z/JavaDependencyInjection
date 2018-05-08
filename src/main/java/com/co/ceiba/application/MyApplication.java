package com.co.ceiba.application;

import com.co.ceiba.application.java.legacy.EmailService;

public class MyApplication {
	
	private EmailService email = new EmailService();
	
	public MyApplication(EmailService email) {
		this.email = email;
	}
	
	public void processMessages(String message, String receiver) {
		// do some message validation, manipulation logic etc
		this.email.sendEmail(message, receiver);
	}

}
