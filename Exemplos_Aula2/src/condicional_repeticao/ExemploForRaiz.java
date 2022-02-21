package condicional_repeticao;

public class ExemploForRaiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double num, sroot, rerr;
			for(num = 1.0; num < 100.0; num++) {
				sroot = Math.sqrt(num);
				System.out.println("Square root of " + num + " is " + sroot);
				// calcula o erro de arredondamento 
				rerr = num - (sroot * sroot);
				System.out.println("Rounding error is "+ rerr);
				System.out.println();
			}

	}

}
