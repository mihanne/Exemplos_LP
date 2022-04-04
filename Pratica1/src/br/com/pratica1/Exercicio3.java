package br.com.pratica1;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner (System.in);
		
		int numVogal = 0;
		String frase;
		
		System.out.println("Digite uma frase: ");
		frase = entrada.nextLine();
		//converter tudo para maiusculo para simplificar a busca
		frase = frase.toUpperCase();
		String vogais="";
		char c;
		for(int i=0; i < frase.length(); i++)
			{
				c=frase.charAt(i);
				if(c == 'A' || c == 'E' || c =='I' || c == 'O' || c == 'U')
				{
					vogais=vogais+Character.toString(c);
					System.out.println(vogais);
				}
			}
				
		if (vogais.contains("A"))
			numVogal ++;				
		if (vogais.contains("E"))
			numVogal ++;
		if (vogais.contains("I"))
			numVogal ++;
		if (vogais.contains("O"))
			numVogal ++;
		if (vogais.contains("U"))
			numVogal ++;
			

		System.out.println("A frase : " + frase + " possui " + numVogal + " vogal(is)");
			
	}

}
