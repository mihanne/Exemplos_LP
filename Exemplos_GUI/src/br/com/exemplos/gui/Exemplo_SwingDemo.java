package br.com.exemplos.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Exemplo_SwingDemo implements ActionListener {
	JLabel jlab;
	Exemplo_SwingDemo() {
		
		// Cria um contêiner JFrame.
		JFrame jfrm = new JFrame("Uma janela simples App");
		// Fornece um tamanho inicial para o quadro.
		jfrm.setLayout(new FlowLayout());

		jfrm.setSize(220, 90);	//Define as dimensões do quadro.
		// Encerra o programa quando o usuário fecha o aplicativo.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//	Encerra quando fechado

		// Cria dois botões.
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		// Adiciona ouvintes de ação.
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		// Adiciona os botões ao painel de conteúdo.
		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);
		

		// Cria um rótulo.
		jlab = new JLabel("Pressione o botão.");
		jfrm.add(jlab);

		// Exibe o quadro.
		jfrm.setVisible(true);
	}
	
	// Trata eventos de botão.
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Up"))
			jlab.setText("Você pressionou o botão Up.");
		else 
			jlab.setText("Você pressionou o botão Down. ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()  {
				public void run() { 
					new Exemplo_SwingDemo();
		}
		});
	}
}
