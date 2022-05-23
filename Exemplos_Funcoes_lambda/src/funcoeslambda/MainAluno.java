package funcoeslambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
public class MainAluno {

	public static void main(String[] args) {
		GeraAluno construtor = Aluno::new;
		
		Aluno a = construtor.ConstroiAluno("Joao", 10);
		System.out.println(a);
		
		
		ArrayList <String > lista = new ArrayList <>(Arrays.asList("uva", null , "laranja", "pera"));
		//equivalente a lista.removeIf(x -> x == null)
		lista.removeIf(Objects::isNull);
		System.out.println(lista);

	}

}
