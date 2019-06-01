package Telas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Componentes.JLabelPadrao;
import Imagens.ImagensTela;

public class TelaDeHome extends TelaPadrao{
	
	public TelaDeHome() {
		super("Tela Principal");
		setSize(720, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		adicionarMenus();
		adicinarJLabel();
		repaint();
		setVisible(true);
	}
	
	public void adicinarJLabel() {
		JLabel Inicial = new JLabelPadrao("SEJA BEM-VINDO", 300, 145, 300, 45);
		Inicial.setForeground(new Color(211,127,37));
		Inicial.setFont(new Font("Amatic", Font.BOLD, 28));
		add(Inicial);
		
		JLabel Logo = new JLabel(ImagensTela.LOGO);
		Logo.setBounds(250, -155, 200, 500);
		add(Logo);
		
		JLabel lbtriangulosDireita = new JLabel(ImagensTela.TRIANGULOS);
		lbtriangulosDireita.setBounds(-1, -1, 100, 600);
		add(lbtriangulosDireita);
		
		JLabel lbtriangulosEsquerda = new JLabel(ImagensTela.TRIANGULOS);
		lbtriangulosEsquerda.setBounds(615, 0, 100, 600);
		add(lbtriangulosEsquerda);
		
	}
	
	public void adicionarMenus() {
		JMenuBar barraDeMenu = new JMenuBar();
		setJMenuBar(barraDeMenu);
		
		JMenu opcoes = new JMenu("Opções");
		opcoes.setFont(new Font("Amatic", Font.BOLD, 20));
		barraDeMenu.add(opcoes);
		
		JMenuItem novoPedido = new JMenuItem("Novo Pedido");
		novoPedido.setFont(new Font("Amatic", Font.BOLD, 20));
		opcoes.add(novoPedido);
		
		JMenuItem excluirPedido = new JMenuItem("Excluir Pedido");
		excluirPedido.setFont(new Font("Amatic", Font.BOLD, 20));
		opcoes.add(excluirPedido);
		
		JMenuItem sair = new JMenuItem("Sair");
		sair.setFont(new Font("Amatic", Font.BOLD, 20));
		opcoes.add(sair);
		
		add(barraDeMenu);
		
	}
	
	public static void main(String[] args) {
		new TelaDeHome();
	}

}
