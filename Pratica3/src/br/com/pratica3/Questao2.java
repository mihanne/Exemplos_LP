package br.com.pratica3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtvoto;
	float candidatoA=0, candidatoB=0, nulo=0, branco=0, totalvotos = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
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
	public Questao2() {
		
		setTitle("Elei\u00E7\u00F5es para Representante de Turma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtvoto = new JTextField();
		txtvoto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtvoto.setBounds(102, 158, 112, 39);
		contentPane.add(txtvoto);
		txtvoto.setColumns(10);
			
		JLabel lblNewLabel = new JLabel("20 - MARIA");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(100, 31, 170, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblPedro = new JLabel("1- NULO");
		lblPedro.setFont(new Font("Arial", Font.BOLD, 14));
		lblPedro.setBounds(100, 90, 170, 32);
		contentPane.add(lblPedro);
		
		JLabel lblPedro_2 = new JLabel("30- PEDRO");
		lblPedro_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblPedro_2.setBounds(100, 57, 170, 32);
		contentPane.add(lblPedro_2);
		
		JLabel lblBranco = new JLabel("2- BRANCO");
		lblBranco.setFont(new Font("Arial", Font.BOLD, 14));
		lblBranco.setBounds(100, 116, 170, 32);
		contentPane.add(lblBranco);
		
		JButton btnVotar = new JButton("VOTAR");
		btnVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int voto= Integer.parseInt(txtvoto.getText());
				switch (voto)
				{
				case 20:
					candidatoA++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 30:
					candidatoB++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1:
					nulo++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					branco++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso", "Eleição",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"Digite um número válido", "Eleição",JOptionPane.ERROR_MESSAGE);
				}
				txtvoto.setText("");
				txtvoto.setFocusable(isEnabled());
				
			}
		});
		btnVotar.setBackground(Color.ORANGE);
		btnVotar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVotar.setBounds(10, 221, 84, 21);
		contentPane.add(btnVotar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtvoto.setText("");
				txtvoto.setFocusable(isEnabled());
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelar.setBackground(SystemColor.activeCaption);
		btnCancelar.setBounds(115, 221, 133, 21);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("Seu Voto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(8, 171, 84, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("APURAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalvotos= candidatoA+candidatoB+nulo+branco;
				if (candidatoA > candidatoB) {
					//quem ganhou foi o candidato A
					float result=(candidatoA/totalvotos)*100;
					JOptionPane.showMessageDialog(null, "Candidato Vencedor: Maria, com "+ result + " %","Resultado",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (candidatoB >candidatoA) {
					float result=(candidatoB/totalvotos)*100;
					JOptionPane.showMessageDialog(null, "Candidato Vencedor: Pedro, com "+ result + " %","Resultado",JOptionPane.INFORMATION_MESSAGE);
				}
					
				else
					JOptionPane.showMessageDialog(null, "Empate entre os dois candidatos "+ candidatoB/totalvotos*100 +  "%","Resultado",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(281, 221, 106, 21);
		contentPane.add(btnNewButton);
	}

}
