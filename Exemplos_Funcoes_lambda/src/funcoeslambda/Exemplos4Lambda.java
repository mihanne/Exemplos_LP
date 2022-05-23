package funcoeslambda;

public class Exemplos4Lambda {

	public static void main(String[] args) {
		String n1 = "Jose", n2 = "Anastacio";
		int x = 1, y = 2;
		
		Runnable r = () -> System.out.println(soma(x, y));
		r.run();
		
		ManipulaParStr f = (s1, s2) -> {
		//x = 1; //erro - nao pode alterar variavel externa
		return s1.toUpperCase() + " " + s2.toUpperCase ();
		};
		
		System.out.println(f.aplica(n1, n2));
		}
		
		interface ManipulaParStr { String aplica(String s1, String s2); }
		public static int soma(int x, int y) { return x + y; }

	}
