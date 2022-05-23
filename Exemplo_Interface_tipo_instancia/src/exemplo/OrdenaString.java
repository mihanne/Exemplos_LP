package exemplo;

import java.util.Arrays;

public class OrdenaString {

	public static void main(String[] args) {
		String[] nomes = {"Joaquim", "Anderson", "Ana", "Joana"};
		Arrays.sort(nomes);
		
		for(String n: nomes)System.out.println(n);
		
		ComparaTamanho nomes1 = new ComparaTamanho();
		System.out.println(nomes1.compare("Ana", "Anderson"));
		

	}

}
