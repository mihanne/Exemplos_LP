package br.com.pratica2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4_v2 {

	public static void main(String[] args) {
		final Scanner entrada = new Scanner (System.in);
		Random numrandomico = new Random();
		short opcao,numPoltrona;
		int[] lugares= new int[100];
		int numVoo,cont=0;
		
		String cpf, dataVoo, horaVoo;
		do {
		 System.out.println("\n1- Cadastrar Passageiro\n2- Check in\n3- Cancelar Voo\n4- Sair");   
		 opcao = entrada.nextShort();
		 
		 switch (opcao) {
		 
		 case 1:
		     System.out.println("CPF: ");
		     cpf= entrada.next();
		     System.out.println("Data do Voo: ");
		     dataVoo= entrada.next();
		     System.out.println("Hora do Voo: ");
		     horaVoo= entrada.nextLine();
	    	 
	         System.out.println("Cadastro Efetuado com Sucesso. Voo num: "+ numrandomico.nextInt(999)); 
	         break;
		 
		 case 2:
			 System.out.println("Entre com o CPF:");
			 cpf = entrada.next();
			 System.out.println("Número do Voo:");
			 numVoo = entrada.nextInt();
			 
			 System.out.println("\nEscolha o numero da poltrona entre 1 e 100:");
			 numPoltrona = entrada.nextShort();
			 if (numPoltrona>=1 && numPoltrona<=100)
			 {
			 //Procurar se existe a poltrona no vetor
				if (lugares[numPoltrona-1]!=0)
					 System.out.println("Poltrona já ocupada");
				else 
				{
					lugares[numPoltrona-1] = numPoltrona;
					System.out.println("Check-in realizado com Sucesso");
				}
			 }
				else
				System.out.println("Poltrona Inválida");
			 
			 break;
		 
		 case 3:
			 System.out.println("Entre com o CPF:");
			 cpf = entrada.next();
			 System.out.println("Número do Voo:");
			 numVoo = entrada.nextInt();
			 System.out.println("Numero da poltrona:");
			 numPoltrona = entrada.nextShort();
			 
			if (numPoltrona==lugares[numPoltrona-1]) {
					 System.out.println("Voo cancelado com sucesso");				
				 	 lugares[numPoltrona-1]=0;
				 }
			else
				   System.out.println("Erro ao cancelar o voo tente novamente");
			 break;
		 case 4:
			 System.out.println("Fim...");
			 break;
		 default:	 
			 System.out.println("Opção Inválida");
		 }
		 System.out.printf("\n---------------------------------------------------------");
		}while(opcao!=4);
		for (int i=0;i<100;i++)
		 {
			System.out.println(lugares[i]);
		 }
	}
}
