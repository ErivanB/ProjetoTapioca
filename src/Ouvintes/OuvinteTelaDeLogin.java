package Ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Telas.JanelaLogin;
import Telas.TelaDeCadastro;
import Telas.TelaDeHome;

public class OuvinteTelaDeLogin implements ActionListener{

	private JanelaLogin janeladelogin;
	
	public OuvinteTelaDeLogin(JanelaLogin janeladelogin) {
		this.janeladelogin = janeladelogin;
	}
	
	public void actionPerformed(ActionEvent e) {
		String labelbotao = e.getActionCommand();
		
		switch (labelbotao) {
		case "Novo":
			janeladelogin.dispose();
			new TelaDeCadastro();
			break;
			
		case "Logar":
			String login = janeladelogin.getTfLogin().getText();
			String senha = janeladelogin.getTfsenha().getText();
			if (login.equals("admin")) {
				if (senha.equals("admin")) {
					janeladelogin.dispose();
					new TelaDeHome();
				}
			}
		}
		

			
	}
}
