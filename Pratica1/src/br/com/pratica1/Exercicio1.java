package br.com.pratica1;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				final Scanner entrada = new Scanner(System.in);
				
				int distancia, consumoFinal;
				short velocidadeMedia, kmVeiculo, tempoPercorrido ;
				
				System.out.println("Tempo gasto em horas: ");
				tempoPercorrido = entrada.nextShort();
				
				System.out.println("Velocidade M�dia: ");
				velocidadeMedia = entrada.nextShort();
				
				System.out.println("km/Litro do ve�culo: ");
				kmVeiculo = entrada.nextShort();
				
				distancia = tempoPercorrido * velocidadeMedia;
				
				consumoFinal = distancia/kmVeiculo;
				
				System.out.println("O consumo final de combust�vel em litros foi de : "+ consumoFinal);
		}
	}
