package Lógica;

import java.util.ArrayList;

public class Central {
	
	private ArrayList<Administrador> AdministradoresCadastrados = new ArrayList<Administrador>();
	private ArrayList<Ingrediente> IngredientesCadastrados = new ArrayList<Ingrediente>();
	private ArrayList<Tapioca> TapiocasCadastradas = new ArrayList<Tapioca>();
	
	public ArrayList<Tapioca> getTapiocasCadastradas() {
		return TapiocasCadastradas;
	}

	public void setTapiocasCadastradas(ArrayList<Tapioca> tapiocasCadastradas) {
		TapiocasCadastradas = tapiocasCadastradas;
	}

	public ArrayList<Ingrediente> getIngredientesCadastrados() {
		return IngredientesCadastrados;
	}

	public void setIngredientesCadastrados(ArrayList<Ingrediente> ingredientesCadastrados) {
		IngredientesCadastrados = ingredientesCadastrados;
	}

	public ArrayList<Administrador> getAdministradoresCadastrados() {
		return AdministradoresCadastrados;
	}

	public void setAdministradoresCadastrados(ArrayList<Administrador> administradoresCadastrados) {
		AdministradoresCadastrados = administradoresCadastrados;
	}

	public boolean CadastrarAdmin(Administrador adm) {
		for (Administrador administrador : AdministradoresCadastrados) {
			if (administrador.getCPF().equals(adm.getCPF())) {
				return false;
			}
		}
		AdministradoresCadastrados.add(adm);
		return true;
	}
	
	public boolean RecuperarSenha(String cpf) {
		for (Administrador administrador : AdministradoresCadastrados) {
			if(cpf.equals(administrador.getCPF())) {
				String newsenha = null;
				administrador.setCPF(newsenha);
				return true;
			}
		}
		return false;
	}
	
	public boolean RedefinirSenha(String senha, String CPF) {
		for (Administrador administrador : AdministradoresCadastrados) {
			if (administrador.getCPF().equals(CPF)) {
				if(administrador.getSenha().equals(senha)) {
					administrador.setSenha(senha);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean ExcluirAdministrador(String senha, String cpf) {
		for (Administrador administrador : AdministradoresCadastrados) {
			if (administrador.getCPF().equals(cpf)) {
				if(administrador.getSenha().equals(senha)) {
					AdministradoresCadastrados.remove(administrador);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean CadastrarIngrediente(Ingrediente ingre) {
		for (Ingrediente i : IngredientesCadastrados) {
			if (i.getNome().equals(ingre.getNome()))
				return false;
		}
		IngredientesCadastrados.add(ingre);
		return true;
	}
	
	public boolean DeletarIngrediente(Ingrediente ingre) {
		for (Ingrediente i : IngredientesCadastrados) {
			if (i.equals(ingre)) {
				IngredientesCadastrados.remove(ingre);
				return true;
			}
		}
		return false;
	}
	
	public boolean CadastrarTapioca(Tapioca tap) {
		for (Tapioca t : TapiocasCadastradas) {
			if (t.getNome().equals(tap.getNome())) {
				return false;
			}
		}
		TapiocasCadastradas.add(tap);
		return true;
	}
	

}
