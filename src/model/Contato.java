package model;

public class Contato {
	private String nome;
	private String email;
	private String mensagem;
	private int id;
	
	public Contato(){
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", mensagem="
				+ mensagem + ", id=" + id + "]";
	}

	
	
	
	
}
