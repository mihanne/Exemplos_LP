package operadores;

public class ExemploCurtoCircuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, d, q;
		n = 10; d = 2;
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		d = 0; // configura d com zero
		// Já que d e igual a zero, o segundo operando nao e avaliado.
		if(d != 0 && (n % d) == 0)
			System.out.println(d + "is a factor of " + n);
		/* Tente a mesma coisa sem Isso causará um erro de divisao por zero */
		//if(d != 0 & (n % d) == 0)
		//	System.out.println(d + "is a factor of " + n);

	}

}
