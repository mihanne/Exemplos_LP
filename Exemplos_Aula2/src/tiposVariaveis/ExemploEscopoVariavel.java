package tiposVariaveis;

public class ExemploEscopoVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x; // conhecida pelo codigo dentro de main()
		x = 10;
		if(x == 10) { // inicia novo escopo
			int y = 20; // conhecida apenas nesse bloco
			// tanto x quanto y sao conhecidas aqui.
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		// y = 100; // Erro! Y não é conhecida aquí
		// x ainda e conhecida aqui.
		System.out.println("x is " + x);

	}

}
