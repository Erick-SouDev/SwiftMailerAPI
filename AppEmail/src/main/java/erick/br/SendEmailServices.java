package erick.br;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import erick.br.model.AssuntoEmail;

@Service
public class SendEmailServices {

	@Autowired
	private JavaMailSender javaMailSender;
	public SendEmailServices(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@Async
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
