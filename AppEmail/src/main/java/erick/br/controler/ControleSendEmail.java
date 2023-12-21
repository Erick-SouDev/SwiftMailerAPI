package erick.br.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import erick.br.model.AssuntoEmail;

@RestController
@RequestMapping(path = { "/" })
public class ControleSendEmail {

	@PostMapping(path = "/sendMail")
	public  ResponseEntity<?> sendMail(@RequestBody AssuntoEmail assuntoEmail) {
		return null;

	}
}
