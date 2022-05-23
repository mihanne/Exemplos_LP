package funcoeslambda;

import java.util.Arrays;
import java.util.ArrayList;

public class Exemplo_lamda1 {

	public static void main(String[] args) {
		/*String[] frutas = {"manga", "banana", "uva", "maca", "abacate"};
		Arrays.sort(frutas , (s1, s2) -> -s1.compareTo(s2));
		for(String s: frutas) System.out.println(s);
		*/
		//exemplo removeif
		ArrayList <Integer > lista = new ArrayList <Integer >(Arrays.asList(-2,1,10,13,-5,8,22,9));
			lista.removeIf( i -> i%2 == 0); //Remove pares
		for(Integer teste: lista) System.out.println(teste);
		
	}

}
