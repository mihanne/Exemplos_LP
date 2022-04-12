package br.com.pratica3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class Questão1 extends JFrame {
	public Questão1() {
	}
	 private static final long serialVersionUID = 1L;
	 
	public static void main(String[] args) {
		
			Questão1 field = new Questão1();
		    field.Tela1();

	}
	private void Tela1() {
        Container janela = getContentPane();
        getContentPane().setLayout(null);

        //Define os rótulos dos botões
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        labelNome.setBounds(50,40,100,20);
        labelCpf.setBounds(50,80,100,20);

        //Define as máscaras

        MaskFormatter mascaraCpf = null;


        try{
               mascaraCpf = new MaskFormatter("#########-##");
               mascaraCpf.setPlaceholderCharacter('_');

        }
        catch(ParseException excp) {
               System.err.println("Erro na formatação: " + excp.getMessage());
               System.exit(-1);
        }

        //Seta as máscaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextNome = new JFormattedTextField();   
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        jFormattedTextNome.setBounds(150,40,100,20);
        jFormattedTextCpf.setBounds(150,80,100,20);
        JButton btnOK = new JButton("Conferir CPF");
        btnOK.setBounds(130,120,150,20);
        //Adiciona os rótulos e os campos de textos com máscaras na tela
        janela.add(labelNome);
        janela.add(labelCpf);   
        janela.add(jFormattedTextNome);
        janela.add(jFormattedTextCpf);
        janela.add(btnOK);
        
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CPF= (String) jFormattedTextCpf.getValue();
		        CPF=CPF.replace("-", "");
		        System.out.println(CPF);
				if (ValidaCPF.isCPF(CPF) == true)
					 JOptionPane.showMessageDialog(null,"CPF Válido " + ValidaCPF.imprimeCPF(CPF));
		         else JOptionPane.showMessageDialog(null,"Erro, CPF invalido !!!\n"); 
				
			}
		});
}

}
