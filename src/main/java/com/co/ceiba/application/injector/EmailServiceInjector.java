package com.co.ceiba.application.injector;

import com.co.ceiba.application.consumer.Consumer;
import com.co.ceiba.application.consumer.MyDIApplication;
import com.co.ceiba.application.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {
	
	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}
