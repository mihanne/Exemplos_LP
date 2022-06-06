package br.com.exemplo.recursao;
import java.util.Scanner;

public class ExemploFatorial {
	// Um exemplo simples de recursão.
	// Esta é uma função recursiva.
	static int factR(int n) {
		int result;
		if(n==1) return 1;
		//Executa a chamada recursiva a factR( ).
		result = factR(n-1) * n; 
		return result;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero para calcular o fatorial: ");
		int num = ler.nextInt();
		System.out.println(factR(num));

	}

}
