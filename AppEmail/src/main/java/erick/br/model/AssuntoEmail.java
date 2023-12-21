package erick.br.model;

public class AssuntoEmail {

	private String distinatary;
	private String title;
	private String message;
	private String body;
	public AssuntoEmail(String distinatary, String title, String message, String body) {
		super();
		this.distinatary = distinatary;
		this.title = title;
		this.message = message;
		this.body = body;
	}

	
	public AssuntoEmail() {
		
	}


	public String getDistinatary() {
		return distinatary;
	}


	public void setDistinatary(String distinatary) {
		this.distinatary = distinatary;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}
	
	
}
