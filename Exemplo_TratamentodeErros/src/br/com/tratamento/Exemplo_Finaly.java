package br.com.tratamento;

public class Exemplo_Finaly {

	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5}; // array de 6 posições
		try {
			for (int i=0; i<10; i++) {
			array [i] += i;
			System.out.println(array [i]);
			}
		System.out.println ("bloco executado com sucesso");
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println ("Acessou im índice inexistente");
		}
		catch ( Exception e ) {
			System.out.println ("Outro tipo de exceção ocorreu");
		}
		finally {
			System.out.println ("Isto SEMPRE executa!");
		}
		
	}
}
