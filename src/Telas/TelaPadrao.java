package Telas;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPadrao extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaPadrao(String titulo) {
		setTitle(titulo);
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	}
	
	public void incluirtitulo() {
		JLabel nome  = new JLabel("Tapiocaria");
		nome.setOpaque(true);
		nome.setFont(new Font("Arial", Font.BOLD, 26));
		nome.setBounds(0, 200, 500, 50);
		add(nome);
	}

}
