package Telas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Componentes.JLabelPadrao;
import Componentes.JPassworldFieldPadrao;
import Componentes.JTextFieldPadrao;
import Imagens.ImagensTela;
import Ouvintes.OuvinteTelaDeLogin;

public class JanelaLogin extends TelaPadrao {

	public JanelaLogin() {
		super("Tela de Login");
		adicionarTextfields();
		adicionarLabel();
		adicionarButton();
		setResizable(false);
		setVisible(true);
		repaint();
	}
	
	private JTextField tfLogin;
	private JTextField tfsenha;
	
	private void adicionarTextfields() {
		tfLogin = new JTextFieldPadrao(145, 220, 225, 30);
		tfLogin.setToolTipText("Digite seu login aqui!");
		add(tfLogin);
		
		tfsenha = new JPassworldFieldPadrao(145, 270, 225, 30);
		tfsenha.setToolTipText("Digite sua senha aqui!");
		add(tfsenha);
	}
	
	public void adicionarButton() {
		JButton btLogin = new JButton("Logar", ImagensTela.ICONE_LOGAR);
		btLogin.setBounds(110, 350, 120, 40);
		btLogin.setFont(new Font("Amatic", Font.BOLD, 22));
		add(btLogin);
		
		JButton btNovo = new JButton("Novo", ImagensTela.ICONE_NOVO);
		btNovo.setBounds(250, 350, 120, 40);
		btNovo.setFont(new Font("Amatic", Font.BOLD, 22));
		add(btNovo);
		
		OuvinteTelaDeLogin ouvinte = new OuvinteTelaDeLogin(this);
		btLogin.addActionListener(ouvinte);
		btNovo.addActionListener(ouvinte);
	}
	
	private void adicionarLabel() {
		JLabel lblogin = new JLabelPadrao("Login", 90, 220, 50, 30);
		add(lblogin);
		
		JLabel lbsenha = new JLabelPadrao("Senha", 90, 270, 50, 30);
		add(lbsenha);
		
		JLabel TelaLogin = new JLabelPadrao("TELA DE LOGIN", 180, 160, 300, 40);
		TelaLogin.setForeground(new Color(211,127,37));
		TelaLogin.setFont(new Font("Amatic", Font.BOLD, 36));
		add(TelaLogin);
		
		JLabel RecuperarSenha = new JLabelPadrao("Esqueceu sua senha ?", 180, 400, 150, 30);
		RecuperarSenha.setFont(new Font("Amatic", Font.BOLD, 24));
		RecuperarSenha.setForeground(new Color(211,127,37));
		add(RecuperarSenha);
		
		JLabel Logo = new JLabel(ImagensTela.LOGO);
		Logo.setBounds(130, -170, 200, 500);
		add(Logo);
	}

	public JTextField getTfLogin() {
		return tfLogin;
	}

	public void setTfLogin(JTextField tfLogin) {
		this.tfLogin = tfLogin;
	}

	public JTextField getTfsenha() {
		return tfsenha;
	}

	public void setTfsenha(JTextField tfsenha) {
		this.tfsenha = tfsenha;
	}
	
	public static void main(String[] args) {
		new JanelaLogin();
	}

}
