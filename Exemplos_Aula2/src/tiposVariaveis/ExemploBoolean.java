package tiposVariaveis;

public class ExemploBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b;
		b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);
		// um valor booleano pode controlar a instrucao if 
		if(b) System.out.println("This is executed.");
		b = false;
		if(b) System.out.println("This is not executed.");
		// o resultado de um operador relacional e um valor booleano
		System.out.println("10 > 9 is " + (10 > 9));

	}

}
