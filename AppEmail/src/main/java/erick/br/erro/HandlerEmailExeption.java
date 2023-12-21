package erick.br.erro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSendException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import ch.qos.logback.core.status.Status;

@ControllerAdvice
@RestControllerAdvice
public class HandlerEmailExeption extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler({MailSendException.class})
	public ResponseEntity<Object> handleMailSendException(MailSendException ex) {
        // Lógica para lidar com erros gerais de envio de e-mail
		ObjetoErrors
		 errors = new ObjetoErrors(ex.getLocalizedMessage(), Status.ERROR);
        return new  ResponseEntity<Object>(errors + "Algo ocorreu de errado ao enviar seu email" , HttpStatus.INTERNAL_SERVER_ERROR );
    }
	
	

}
