package com.co.ceiba.application.consumer;

import com.co.ceiba.application.service.MessageService;

public class MyDIApplication implements Consumer {
	
	private MessageService service;
	
	public MyDIApplication(MessageService svc) {
		this.service = svc;
	}
	
	@Override
	public void processMessages(String message, String receiver) {
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(message, receiver);
	}

}
