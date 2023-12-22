package erick.br.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import erick.br.SendEmailServices;
import erick.br.model.AssuntoEmail;

@RestController
@RequestMapping(value  = { "/" })
public class ControleSendEmail {

	@Autowired
	SendEmailServices emailServices;
	@PostMapping(value  = "/sendMail")
	public  ResponseEntity<String> sendMail(@RequestBody AssuntoEmail assuntoEmail) {
		emailServices.sendEmail(assuntoEmail);
		return new ResponseEntity<String>("Email enviado com sucesso" , HttpStatus.OK);

	}
}
