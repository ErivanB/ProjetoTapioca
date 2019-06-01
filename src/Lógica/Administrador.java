package Lógica;

public class Administrador {

	public String login;
	public String senha;
	public String CPF;
	
	public Administrador(String login, String senha, String cPF) {
		this.login = login;
		this.senha = senha;
		CPF = cPF;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
}
