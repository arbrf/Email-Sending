package com.email.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

import com.email.poc.service.JavaMailService;

@SpringBootApplication
public class DemoForEMailSenderApplication {
	
	@Autowired
	private JavaMailService javaMailService;

	public static void main(String[] args) {

				SpringApplication.run(DemoForEMailSenderApplication.class, args);
		
	
	
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendmail() {
		javaMailService.sendMail("shaikmohammadibrahim311@gmail.com", "Congrats Your Profile Shortlisted",
				"We are delight to offer u this position");
	}

}
