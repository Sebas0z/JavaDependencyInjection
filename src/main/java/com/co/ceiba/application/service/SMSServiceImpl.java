package com.co.ceiba.application.service;

public class SMSServiceImpl implements MessageService {
	
	public void sendMessage(String message, String receiver) {
		// logic to send SMS
		System.out.println("SMS sent to " + receiver + " with Message=" + message);
	}

}
