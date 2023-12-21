package erick.br.erro;



public class ObjetoErrors {
	
	private String menssagem;
	private int cod;
	
	public ObjetoErrors(String menssagem , int cod) {
		// TODO Auto-generated constructor stub
		this.cod =cod;
		this.menssagem =menssagem;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getCod() {
		return cod;
	}
	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}
	public String getMenssagem() {
		return menssagem;
	}

}
