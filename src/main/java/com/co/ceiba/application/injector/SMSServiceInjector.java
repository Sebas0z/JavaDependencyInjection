package com.co.ceiba.application.injector;

import com.co.ceiba.application.consumer.Consumer;
import com.co.ceiba.application.consumer.MyDIApplication;
import com.co.ceiba.application.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}
	
	

}
