package Telas;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Componentes.JLabelPadrao;
import Componentes.JPassworldFieldPadrao;
import Componentes.JTextFieldPadrao;
import Imagens.ImagensTela;
import Ouvintes.OuvinteDoBotaoCancelar;
import Ouvintes.OuvinteTelaDeLogin;

public class TelaDeCadastro extends TelaPadrao {

	public TelaDeCadastro() {
		super("Tela de Cadastro");
		setSize(300, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		adicionarJLabel();
		adicionarJTextField();
		adicionarButton();
		setVisible(true);
		repaint();
	}
	
	private JTextField tfNome;
	private JTextField tfSenha;
	private JTextField tfEmail;
	private JTextField tfCpf;
	private JRadioButton sexoM;
	private JButton jbCriar;
	private JButton jbCancelar;
	
	public void adicionarJLabel() {
		JLabel Inicial = new JLabelPadrao("BEM-VINDO", 90, 35, 300, 45);
		Inicial.setForeground(new Color(211,127,37));
		Inicial.setFont(new Font("Amatic", Font.BOLD, 46));
		add(Inicial);
		
		JLabel lbNome = new JLabelPadrao("Nome", 40, 100, 50, 30);
		add(lbNome);
		
		JLabel lbEmail = new JLabelPadrao("E-mail", 40, 140, 50, 30);
		add(lbEmail);
		
		JLabel lbSenha = new JLabelPadrao("Senha", 40, 180, 50, 30);
		add(lbSenha);
		
		JLabel lbCPF = new JLabelPadrao("CPF", 40, 220, 50, 30);
		add(lbCPF);
		
		JLabel lbIdade = new JLabelPadrao("Idade", 40, 260, 50, 30);
		add(lbIdade);

		JLabel lbSexo = new JLabelPadrao("Sexo", 40, 300, 50, 30);
		add(lbSexo);
		
		JLabel tapiocas = new JLabel(ImagensTela.DECORAÇÃO);
		tapiocas.setBounds(-5, 400, 400, 90);
		add(tapiocas);
	}
	
	public void adicionarJTextField() {
		tfNome = new JTextFieldPadrao(100, 105, 140, 25);
		add(tfNome);
		
		tfSenha = new JTextFieldPadrao(100, 145, 140, 25);
		add(tfSenha);
		
		tfSenha = new JPassworldFieldPadrao(100, 185, 140, 25);
		add(tfSenha);
		
		MaskFormatter mascaraCPF;
		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
			JFormattedTextField campocpf = new JFormattedTextField(mascaraCPF);
			campocpf.setBounds(100, 225, 140, 25);
			campocpf.setFont(new Font("Arial", Font.HANGING_BASELINE, 16));
			add(campocpf);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		tfEmail = new JTextFieldPadrao(100, 265, 140, 25);
		add(tfEmail);
	}
	
	public void adicionarButton() {
		sexoM = new JRadioButton("M", true);
		sexoM.setBounds(100, 305, 50, 30);
		add(sexoM);
		
		JRadioButton sexoF = new JRadioButton("F");
		sexoF.setBounds(150, 305, 50, 30);
		add(sexoF);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(sexoF);
		bg.add(sexoM);
		
		jbCriar = new JButton("Criar", ImagensTela.ICONE_CRIAR);
		jbCriar.setBounds(40, 350, 100, 40);
		jbCriar.setFont(new Font("Amatic", Font.BOLD, 18));
		add(jbCriar);
		
		jbCancelar = new JButton("Cancelar", ImagensTela.ICONE_CANCELAR);
		jbCancelar.setBounds(160, 350, 100, 40);
		jbCancelar.setFont(new Font("Amatic", Font.BOLD, 18));
		add(jbCancelar);
		
		OuvinteDoBotaoCancelar ouvinte = new OuvinteDoBotaoCancelar(this);
		jbCancelar.addActionListener(ouvinte);
		
	}

	public static void main(String[] args) {
		new TelaDeCadastro();
	}
	
}
