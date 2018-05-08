package com.co.ceiba.application.service;

public class EmailServiceImpl implements MessageService {
	
	@Override
	public void sendMessage(String message, String receiver) {
		// logic to send email
		System.out.println("Email sent to " + receiver + " with Message=" + message);
	}

}
