package erick.br;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import erick.br.model.AssuntoEmail;

@Service
public class SendEmailServices {

	@Autowired
	private JavaMailSenderImpl javaMailSender;

	public void sendEmail(AssuntoEmail assuntoEmail) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(assuntoEmail.getDistinatary());
		mailMessage.setSubject(assuntoEmail.getTitle());
		mailMessage.setText(assuntoEmail.getBody());
		
		javaMailSender.send(mailMessage);

	}
	
	
	public void sendEmail(AssuntoEmail assuntoEmail , String anexo) {
	// falta implentar 
	}

}
