package br.com.exemplos.gui;
import javax.swing.JOptionPane;

public class Exemplo_Media {

	public static void main(String[] args) {
		float nota1, nota2, calculaMedia;
		nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Digite a primeira nota"));
        nota2 = Float.parseFloat (JOptionPane.showInputDialog("Digite a segunda nota"));
        calculaMedia = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "Resultado da Média = "+ calculaMedia,"Resultado", JOptionPane.WARNING_MESSAGE);
    }

}

