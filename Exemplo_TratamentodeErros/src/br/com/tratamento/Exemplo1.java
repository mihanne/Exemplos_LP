package br.com.tratamento;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int j=10;
		String[] vetor = new String[1];
		vetor[0]="A";
		try {
			while (j > Integer.parseInt (vetor [0]))
		 {
				System.out.println (" "+j);
				j--;
		 }
		 } 
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println ("Não foi fornecido um argumento.");
		}
		 catch (java.lang.NumberFormatException e){
			 System.out.println("Argumento não é um inteiro válido.");}

	}

}
