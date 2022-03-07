package br.com.exemplos.aula3;

public class ExemploBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Usando break para sair de um laço.
			int num;
			num = 100;
			// executa o laço enquanto i ao quadrado é menor do que num
			for(int i=0; i < num; i++) {
				if(i*i >= num) break; // encerra o laço se i*i >= 100 
				System.out.print(i + " ");
			}
			System.out.println("Loop complete.");
			}
}
