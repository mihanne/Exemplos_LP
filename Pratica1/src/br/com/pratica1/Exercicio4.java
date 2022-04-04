package br.com.pratica1;

import java.util.Scanner;
import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner entrada = new Scanner (System.in);
		Random numrandomico = new Random();
		short opcao;
		int numVoo;
		
		String cpf, dataVoo, horaVoo;
		do {
		 System.out.println("\n1- Cadastrar Passageiro\n2- Check in\n3- Cancelar Voo\n4- Sair");   
		 opcao = entrada.nextShort();
		 
		 switch (opcao) {
		 
		 case 1:
		     System.out.println("CPF: ");
		     cpf= entrada.nextLine();
		     System.out.println("Data do Voo: ");
		     dataVoo= entrada.nextLine();
		     System.out.println("Hora do Voo: ");
		     horaVoo= entrada.nextLine();
	    	 
	         System.out.println("Cadastro Efetuado com Sucesso. Voo num: "+ numrandomico.nextInt(999)); 
	         break;
		 
		 case 2:
			 System.out.println("Entre com o CPF:");
			 cpf = entrada.nextLine();
			 System.out.println("Número do Voo:");
			 numVoo = entrada.nextInt();
		 
			 System.out.println("Check in realizado com sucesso");
			 break;
		 
		 case 3:
			 System.out.println("Entre com o CPF:");
			 cpf = entrada.nextLine();
			 System.out.println("Número do Voo:");
			 numVoo = entrada.nextInt();
			 
			 System.out.println("Voo cancelado com sucesso"); 
			 break;
		 case 4:
			 System.out.println("Fim...");
			 break;
		 default:	 
			 System.out.println("Opção Inválida");
		 }
		 
		}while(opcao!=4);
	}
}
