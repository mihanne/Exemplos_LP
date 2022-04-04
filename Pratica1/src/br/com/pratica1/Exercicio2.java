package br.com.pratica1;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				final Scanner entrada = new Scanner (System.in);
				 System.out.println("Digite a Placa do carro: ");
				 String placa = entrada.nextLine();
				 
				 System.out.println("Ano de fabricação do carro: ");
				 short anoFab = entrada.nextShort();
				 
				 if (anoFab<2010) 
					 System.out.println("Carro Velho - placa: "+ placa);
				 
				 else if (anoFab<=2021) 
					 System.out.println("Carro Semi novo - placa:"+ placa);
				 
				 else if (anoFab==2022) 
					 System.out.println("Carro novo - placa: "+ placa );
				 else
					 System.out.println("Situação desconhecida");
				 
				 String novaPlaca = placa
						 .replace("A", "*")
				 		 .replace("a", "*")
				 		 .replace("E", "*")
				 		 .replace("e", "*")
				 		 .replace("I", "*")
				 		 .replace("i", "*")
				 		 .replace("O", "*")
				 		 .replace("o", "*")
				 		 .replace("U", "*")
				 		 .replace("u", "*"); 
				 System.out.println("\nPlaca com máscara: "+ novaPlaca );
	}

}
