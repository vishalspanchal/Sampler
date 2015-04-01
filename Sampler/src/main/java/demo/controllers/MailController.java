package demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.mail.MailSender;

@RestController
public class MailController {
	
	@Autowired
	private MailSender mailSender;
	
	@RequestMapping("/hello")
	public String sayHello()	{
		return "Hello World";
	}
	
	@RequestMapping("/mail")	
	public String sendMail()	{
		mailSender.send("test@mail.com", "Test Mail", " Test Mail Sent ");
		
		return "Mail Sent....";
	}
}
