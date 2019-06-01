package Ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Telas.JanelaLogin;

public class OuvinteDoBotaoCancelar implements ActionListener{
	
	private JFrame janelaAtual;
	
	public OuvinteDoBotaoCancelar(JFrame janelaAtual) {
		this.janelaAtual = janelaAtual;
	}
	
	public void actionPerformed(ActionEvent e) {
		janelaAtual.dispose();
		new JanelaLogin();
	}

}
