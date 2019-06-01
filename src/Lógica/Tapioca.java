package Lógica;

import java.util.ArrayList;

public class Tapioca {

	private String nome;
	private float preco;
	private ArrayList<Ingrediente> Ingredientes = new ArrayList<Ingrediente>();
	public Tapioca(String nome, ArrayList<Ingrediente> ingredientes) {
		this.nome = nome;
		Ingredientes = ingredientes;
		for (Ingrediente ingrediente : ingredientes) {
			this.preco += ingrediente.getPreco100();
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		Ingredientes = ingredientes;
	}
	
}
