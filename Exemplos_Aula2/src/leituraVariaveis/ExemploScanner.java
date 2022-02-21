package leituraVariaveis;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	    String nome;
	    int idade;
	    System.out.println("Seu nome");
	    nome = entrada.nextLine();
	    System.out.println("Sua idade");
	    idade = entrada.nextInt();
	    if (idade<18)
	    	System.out.println("Você é Menor de idade");
	    else
	    	System.out.println("Você é Maior de idade");
	}

}
