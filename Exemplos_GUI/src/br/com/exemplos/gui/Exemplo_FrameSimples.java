package br.com.exemplos.gui;
import javax.swing.*;

public class Exemplo_FrameSimples {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Aplica��o");
		JButton but = new JButton("Clique no Bot�o");
		JLabel texto = new JLabel("N�meros de Click: 0");
		JPanel painel = new JPanel( );
		painel.add(but);
		painel.add(texto);
		frame.getContentPane( ).add(painel);
		frame.pack( );
		frame.show( );
	}

}
