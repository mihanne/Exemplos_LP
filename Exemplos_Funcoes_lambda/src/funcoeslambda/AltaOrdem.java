package funcoeslambda;
import java.util.Arrays;
import java.util.Comparator;

public class AltaOrdem {
	
	public static Comparator <String> comparaNaDirecao(int direcao) {
		return (x, y) -> direcao * x.compareTo(y);
	}
	public static void main(String[] args) {
		String[] amigos = {"Zulu", "Nina", "Tina", "Rael", "Amos"};
		
		//ordenacao decrescente
		 Arrays.sort(amigos , comparaNaDirecao (-1));
		for(String a: amigos)
		System.out.println(a);
		}
		
		

}
