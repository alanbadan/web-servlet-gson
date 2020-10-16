package br.com.alura.gerenciador.modelo;

public class Usuario {
	
	String login;
	String senha;
	
	
	public String getNome() {
		return login;
	}
	public void setNome(String nome) {
		this.login = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean ehIgaul ( String login, String senha) {
		if (!this.login.equals(login)) {
			return false;
		}
		if(!this.senha.equals(senha)) {
			return false;
		}
		return true;
	}
	
	
	
}
