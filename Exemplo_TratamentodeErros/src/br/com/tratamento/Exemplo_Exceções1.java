package br.com.tratamento;

public class Exemplo_Exce��es1 {
	public static void main(String[] args) {
		Conta b1 = new Conta(30, 50);
		try {
			System.out.println(b1.sacar(100));
			
			}
		catch (IllegalArgumentException e) {
			// capturando a exce��o 
			System.out.println("Saldo Insuficiente");
			}
	}
}
