package br.com.Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Calculadora extends JFrame {

	private double primeiroNumero;
	private String operacao;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVisor;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnSoma;
	private JButton btnFor;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnIgual;
	private JButton btnSubtracao;
	private JButton btnMultiplicacao;
	private JButton btndivisao;
	private JButton btnZero;
	private JButton btnNewButton_1;
	private JButton btnC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtVisor.getText().contains(",")) {
					txtVisor.setText(txtVisor.getText() + "," );
				}
				
			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVirgula.setBounds(10, 299, 70, 35);
		contentPane.add(btnVirgula);
		
		txtVisor = new JTextField();
		txtVisor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVisor.setForeground(new Color(255, 255, 255));
		txtVisor.setBackground(new Color(0, 0, 0));
		txtVisor.setBounds(10, 27, 314, 71);
		contentPane.add(txtVisor);
		txtVisor.setColumns(10);
		
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "1");	
			}
		});
		btnOne.setBounds(10, 251, 70, 37);
		contentPane.add(btnOne);
		
		btnTwo = new JButton("2 ");
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "2");
			
			}					
		});
		btnTwo.setBounds(90, 251, 70, 37);
		contentPane.add(btnTwo);
		
		btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + 3);
				
			}
		});
		btnThree.setBounds(170, 251, 70, 37);
		contentPane.add(btnThree);
		
		btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(txtVisor.getText().replace(",","."));
				operacao = "+";
				txtVisor.setText("");
				
			}
		});
		btnSoma.setBounds(250, 251, 70, 37);
		contentPane.add(btnSoma);
		
		btnFor = new JButton("4");
		btnFor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "4");
		
			}
		});
		btnFor.setBounds(10, 203, 70, 37);
		contentPane.add(btnFor);
		
		btnFive = new JButton("5");
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		btnFive.setBounds(90, 203, 70, 37);
		contentPane.add(btnFive);
		
		btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		btnSix.setBounds(173, 203, 70, 37);
		contentPane.add(btnSix);
		
		btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		btnSeven.setBounds(10, 155, 70, 37);
		contentPane.add(btnSeven);
		
		btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		btnEight.setBounds(90, 155, 70, 37);
		contentPane.add(btnEight);
		
		btnNine = new JButton("9");
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		btnNine.setBounds(173, 155, 70, 37);
		contentPane.add(btnNine);
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double segundoNumero = Double.parseDouble(txtVisor.getText().replace(",","."));
				double resultado = 0;
				
				if (operacao.equals("+")) {
					resultado = primeiroNumero + segundoNumero;
				} else if (operacao.equals("-")) {
					resultado = primeiroNumero - segundoNumero;
				} else if (operacao.equals("*")) {
					resultado = primeiroNumero * segundoNumero;
				} else if (operacao.equals("/")) {
					resultado = primeiroNumero / segundoNumero;
				} else if (operacao.equals("^")) {
					resultado = Math.pow(primeiroNumero,segundoNumero);
				}
		 
				txtVisor.setText(String.valueOf(resultado).replace(".", ","));
				
			}
		});
		btnIgual.setBounds(250, 299, 70, 35);
		contentPane.add(btnIgual);
		
		btnSubtracao = new JButton("-");
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(txtVisor.getText().replace(",","."));
				operacao = "-";
				txtVisor.setText("");
				
			}
		});
		btnSubtracao.setBounds(254, 201, 70, 37);
		contentPane.add(btnSubtracao);
		
		btnMultiplicacao = new JButton("X");
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(txtVisor.getText().replace(",","."));
				operacao = "*";
				txtVisor.setText("");
				
			}
		});
		btnMultiplicacao.setBounds(254, 155, 70, 37);
		contentPane.add(btnMultiplicacao);
		
		btndivisao = new JButton("/");
		btndivisao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btndivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(txtVisor.getText().replace(",","."));
				operacao = "/";
				txtVisor.setText("");
				
			}
		});
		btndivisao.setBounds(254, 109, 70, 35);
		contentPane.add(btndivisao);
		
		btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "0");
				
			}
		});
		btnZero.setBounds(126, 302, 70, 29);
		contentPane.add(btnZero);
		
		btnNewButton_1 = new JButton("√");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(txtVisor.getText().replace(",","."));
				double resultado = Math.sqrt(numero);
				
				txtVisor.setText(String.valueOf(resultado).replace(",","."));
				
				
			}
		});
		btnNewButton_1.setBounds(170, 109, 70, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnExpoente = new JButton("^");
		btnExpoente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExpoente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(txtVisor.getText().replace(",","."));
				operacao = "^";
				txtVisor.setText("");
			}
		});
		btnExpoente.setBounds(90, 109, 70, 35);
		contentPane.add(btnExpoente);
		
		btnC = new JButton("©");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("");
				primeiroNumero = 0;
				operacao = "";
				
			}
		});
		btnC.setBounds(10, 109, 70, 35);
		contentPane.add(btnC);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(Calculadora.class.getResource("/br/com/Calculadora/imagens/gif_calculadora.gif")));
		bg.setBounds(0, 0, 334, 361);
		contentPane.add(bg);

	}
}
