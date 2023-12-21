package erick.br;

import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import erick.br.model.AssuntoEmail;

@Service
public class SendEmailServices {
   
	@Autowired
	private static  SimpleEmail simpleEmail;
	
	@Async
	public static void sendEmail(AssuntoEmail assuntoEmail) {
	   	
	}
	
}
