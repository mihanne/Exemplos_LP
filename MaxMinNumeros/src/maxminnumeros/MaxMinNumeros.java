/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxminnumeros;

/**
 *
 * @author Hanne
 */
import java.util.Scanner;
public class MaxMinNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        System.out.print("Entre com o primeiro inteiro: ");
        num = sc.nextInt();
        if (num < minimo) {
        	minimo = num;
        }
        if (num > maximo) {
        	maximo = num;
        }

        System.out.print("Entre com o segundo inteiro: ");
        num = sc.nextInt();
        if (num < minimo) {
            minimo = num;
        }
        if (num > maximo) {
            maximo = num;
        }

        System.out.print("Entre com o terceiro inteiro: ");
        num = sc.nextInt();
        if (num < minimo) {
            minimo = num;
        }
        if (num > maximo) {
            maximo = num;
        }

        System.out.println("O menor numero é: " + minimo);
        System.out.println("O maior numero é: " + maximo);
    }
      
}
