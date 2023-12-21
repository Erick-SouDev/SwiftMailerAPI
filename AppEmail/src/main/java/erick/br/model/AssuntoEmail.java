package erick.br.model;

public class AssuntoEmail {

	private String Titulo;
	private String mensagem;
	
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getTitulo() {
		return Titulo;
	}
}
