package br.com.exemplos.aula3;
import java.util.Scanner;
public class ExemploIndexOf {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        int cont = 0;
        System.out.println("Escreva sua frase: ");
        frase = entrada.nextLine(); 
        //converte para maiuscula
        //frase = frase.toUpperCase();
        
        if (frase.indexOf("A")!=-1) cont++;
        if (frase.indexOf("E")!=-1) cont++;
        if (frase.indexOf("I")!=-1) cont++;
        if (frase.indexOf("O")!=-1) cont++;
        if (frase.indexOf("U")!=-1) cont++;
        if (frase.indexOf("a")!=-1) cont++;
        if (frase.indexOf("e")!=-1) cont++;
        if (frase.indexOf("i")!=-1) cont++;
        if (frase.indexOf("o")!=-1) cont++;
        if (frase.indexOf("u")!=-1) cont++;
        
        System.out.printf("A frase %s possui %d vogal(is)",frase,cont);

	}

}
