package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MailService;

@RestController
public class MailController {

	@Autowired
	MailService mailService;
	
	@GetMapping(path="/sendMail")
	public void sendMail()
	{
		System.out.println("Step 1");
		mailService.sendMail();
		
	}
	
	
}
