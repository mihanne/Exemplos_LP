package br.com.pratica2;

import java.util.Scanner;
import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final Scanner entrada = new Scanner (System.in);
		Random numrandomico = new Random();
		short opcao,numPoltrona;
		boolean valida, poltronaOcupada;
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
			 poltronaOcupada= false;
			 valida=false;
			 //Procurar se existe a poltrona no vetor
			 while (!valida)
			 {
				 System.out.println("\nEscolha o numero da poltrona entre 1 e 100:");
				 numPoltrona = entrada.nextShort();

			 for (int i=0;i<100;i++)
			 { 
				 poltronaOcupada= false;
				 if (numPoltrona==lugares[i]) {
				 	 poltronaOcupada= true;
				 	System.out.println("Poltrona já ocupada!!!!");
				 	break;
				 }
			 } 
			 //se a poltrona estiver vazia grava no vetor de lugares
			 if (!poltronaOcupada) {
				 lugares[cont]=numPoltrona;
				 cont++;
				 valida=true;
				 System.out.println("Check In efetuado com sucesso!");
			 }
			 }
			 break;
		 
		 case 3:
			 System.out.println("Entre com o CPF:");
			 cpf = entrada.next();
			 System.out.println("Número do Voo:");
			 numVoo = entrada.nextInt();
			 System.out.println("Numero da poltrona:");
			 numPoltrona = entrada.nextShort();
			 valida=false;
			 for (int i=0;i<100;i++)
			 {
				 if (numPoltrona==lugares[i]) {
					 System.out.println("Voo cancelado com sucesso");				
					 valida= true;
				 	 lugares[i]=0;
				 }
			 }
			 if (valida==false) {
				 System.out.println("Erro ao cancelar o voo tente novamente");
			 }
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
