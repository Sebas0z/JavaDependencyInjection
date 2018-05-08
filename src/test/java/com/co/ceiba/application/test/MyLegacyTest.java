package com.co.ceiba.application.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.co.ceiba.application.MyApplication;
import com.co.ceiba.application.consumer.Consumer;
import com.co.ceiba.application.consumer.MyDIApplication;
import com.co.ceiba.application.injector.EmailServiceInjector;
import com.co.ceiba.application.injector.MessageServiceInjector;
import com.co.ceiba.application.injector.SMSServiceInjector;
import com.co.ceiba.application.service.MessageService;

public class MyLegacyTest {

	private MessageServiceInjector injector;

	@Before
	public void setUp() {
		// mock the injector with anonymous class (lambda)
		injector = () ->
		// mock the message service
		new MyDIApplication((message, receiver) -> System.out.println("Mock Message Service implementation"));
	}

	@Test
	public void testing() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Bonjour SV", "sv@sv.com");
	}

	@After
	public void tear() {
		injector = null;
	}

	// @Test
	public void prueba() {
		// MyApplication app = new MyApplication();
		// app.processMessages("Bonjour SV", "sv@sv.com");

		String message = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";

		MessageServiceInjector injector = null;
		Consumer app = null;

		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(message, email);

		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(message, email);

	}

}
