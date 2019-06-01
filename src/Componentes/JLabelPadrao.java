package Componentes;

import java.awt.Font;

import javax.swing.JLabel;

public class JLabelPadrao extends JLabel{

	public JLabelPadrao(String titulo, int x, int y, int w, int h) {
		super(titulo);
		setBounds(x, y, w, h);
		setFont(new Font("Amatic", Font.BOLD, 26));
	}
}
