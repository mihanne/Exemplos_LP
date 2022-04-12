package br.com.pratica3;

import java.awt.BorderLayout;
import javax.swing.text.MaskFormatter;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;

public class Teste1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste1 frame = new Teste1();
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
	public Teste1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(50, 63, 45, 13);
		contentPane.add(lblNewLabel);
		MaskFormatter mascaraCpf= null;
		try {
			
			mascaraCpf = new MaskFormatter("#########-##");
			mascaraCpf.setPlaceholderCharacter('_');
			
		}
	    catch(ParseException excp) {
	           System.err.println("Erro na formatação: " + excp.getMessage());
	           System.exit(-1);
	    }
		JFormattedTextField formattedTextField = new JFormattedTextField(mascaraCpf);
		formattedTextField.setBounds(105, 60, 171, 19);
		contentPane.add(formattedTextField);
	}
}
