package Exe2;

import java.util.ArrayList;
import java.util.Scanner;

public class RedesSociais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		int opcao = 0, menu;
		
		String nome, telefone, usuario, email, user_exclui, user_busc;
		
		
		ArrayList<String> usuarios = new ArrayList<>();
		do {
		System.out.println("---- Seleciona uma das opções abaixo ----");
		System.out.println("(1)Cadastrar ");
		System.out.println("(2)Excluir ");
		System.out.println("(3)Pesquisar ");
		System.out.println("(4)Sair ");
		
		
		menu = entrada.nextInt();
		
		switch(menu)	{
		case 1:
			System.out.println("Insira seu nome:");
			nome = entrada.next();
			System.out.println("Insira seu número de telefone:");
			telefone = entrada.next();
			System.out.println("Insira seu nome de usuário:");
			usuario = entrada.next();
			System.out.println("Insira seu email");
			email = entrada.next();
			
			usuarios.add("Nome: "+nome+ " Telefone: "+ telefone+ " Usuário: "+usuario+ " Email: "+email);
			System.out.println(usuarios.toString());
		break;
		
		case 2:
			int n = usuarios.size();
			System.out.println("Digite o nome do usuário que deseja excluir:");
			user_exclui = entrada.next();
			
			for(int i = 0; i<usuarios.size() ; i++) {
				if(usuarios.get(i).contains(user_exclui)) {
				usuarios.remove(i);
				i--;
				
				System.out.println("Usuário removido com sucesso!");
				System.out.println(usuarios.toString());
			}
			}
			break;
		
		case 3:
			int p = usuarios.size();
			System.out.println("Digite o nome do usuário que deseja localizar:");
			user_busc = entrada.next();
			
			for(int j = 0; j<p ; j++) {
			
				if(usuarios.get(j).contains(user_busc)) {
					System.out.println(usuarios.get(j));
				}
				else if ((j==p-1))
					System.out.println("Registro Não Encontrado");
			}
			
		
		break;
		
		case 4:
			
		break;
		
		default:
		      System.out.println("Opção Inválida. Tente novamente!");
		}
		    
		} while (opcao != 4);
		}
}

		
		
	




	
	


