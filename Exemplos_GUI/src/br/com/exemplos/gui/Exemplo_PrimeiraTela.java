package br.com.exemplos.gui;
import javax.swing.JOptionPane;

public class Exemplo_PrimeiraTela {

	public static void main(String[] args) {
				String nome = JOptionPane.showInputDialog("Digite o nome: "); //substituir a leitura pelo scanner
				String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");

				String nomeCompleto = nome + " " + sobreNome;

				JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto,"Informação",JOptionPane.INFORMATION_MESSAGE);

			}
}
