package Componentes;

import java.awt.Font;

import javax.swing.JTextField;

public class JTextFieldPadrao extends JTextField{

	public JTextFieldPadrao(int x, int y, int w, int h) {
		setBounds(x, y, w, h);
		setFont(new Font("Arial", Font.HANGING_BASELINE, 14));
	}
}
