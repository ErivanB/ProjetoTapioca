package Lógica;

public class Ingrediente {

	private String nome;
	private String valorcalorico;
	private float preco100;
	private boolean disponivel;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValorcalorico() {
		return valorcalorico;
	}
	public void setValorcalorico(String valorcalorico) {
		this.valorcalorico = valorcalorico;
	}
	public float getPreco100() {
		return preco100;
	}
	public void setPreco100(float preco100) {
		this.preco100 = preco100;
	}
	public boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public Ingrediente(String nome, String valorcalorico, float preco100, boolean disponivel) {
		this.nome = nome;
		this.valorcalorico = valorcalorico;
		this.preco100 = preco100;
		this.disponivel = disponivel;
	}
	
	
	
	
}
