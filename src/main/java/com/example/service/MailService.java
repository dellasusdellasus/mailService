package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail()
	{
		System.out.println("Step 2");
		
		SimpleMailMessage msg = new SimpleMailMessage();
	    msg.setTo("yepurivamsikrishna@yahoo.com");

	    msg.setSubject("Testing from Spring Boot");
	    msg.setText("Hello World \n Spring Boot Email");

	    javaMailSender.send(msg);

		
	}

}









    
