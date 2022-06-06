package br.com.exemplo.recursao;

import java.util.Scanner;

public class ExemplosSimplesRecursao {
	/**
     * M�ximo Divisor Comum recursivo
     * @param a
     * @param b
     * @return O MDC de a e b
     */
	public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, (a % b));
    }
	
	
	/**
     * Conta todos os n�meros pares at� n, recursivamente
     * @param n
     * @return 
     */
    public static int contaPares(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        if(n % 2 == 0) {
            return contaPares(n - 1) + 1;
        } else {
            return contaPares(n - 1);
        }
    }
    
    /**
     * Pot�ncia recursiva
     * @param n n�mero a ser elevado
     * @param pot grau da pot�ncia
     * @return n ^ pot
     */
    public static double potencia(int n, int pot) {
        if (pot == 1) {
            return n;
        }
        return n * potencia(n, pot - 1);
    }

    /**
     * N�meros de Fibonacci
     * @param n 
     * @return O n�mero da sequencia desejado
     */
    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);

    }
	public static void main(String[] args) {
		//Execu��o de Exemplos
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite dois numeros para o MDC: ");
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		System.out.println(mdc(num1,num2));

		System.out.println("Digite um numero para contar os pares: ");
		int num3 = ler.nextInt();
		System.out.println(contaPares(num3));
		
		System.out.println("Digite um numero para calcular a pot�ncia: ");
		int num4 = ler.nextInt();
		System.out.println("Digite a pot�ncia: ");
		int num5 = ler.nextInt();
		System.out.println(potencia(num4,num5));
		
		
		System.out.println("Digite um numero para calcular a Fibonacci: ");
		int num6 = ler.nextInt();
		System.out.println(fibo(num6));
		
	}

}
