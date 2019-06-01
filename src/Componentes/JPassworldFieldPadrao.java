package Componentes;

import java.awt.Font;

import javax.swing.JPasswordField;

public class JPassworldFieldPadrao extends JPasswordField {

	public JPassworldFieldPadrao(int x, int y, int w, int h) {
		setBounds(x, y, w, h);
		setFont(new Font("Arial", Font.TYPE1_FONT, 14));
		
	}
	
}
