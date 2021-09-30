package com.aws.citytradeweb.controller;


import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aws.citytradeweb.modeldto.EmailDTO;
import com.aws.citytradeweb.service.EmailSenderService;

@CrossOrigin
@RestController
public class EmailController {
	@Autowired
	private EmailSenderService service;
	
	
	@PostMapping(path="/sendemail",consumes = "application/json")
	public String sendmail(@RequestBody EmailDTO emailDto) throws MessagingException{
	//	String[] to= {"anushkajadhav966@gmail.com","amit.1638@gmail.com","amit.ch1638@gmail.com"};
		service.sendSimpleEmail(emailDto.getTo(),"anushkajadhav966@gmail.com","sukhadajadhav1234@gmail.com", emailDto.getBody(), "greetings");
		return "Email sent successfully";
	}

}
