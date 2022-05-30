package exemploIO;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrincipalArquivo {

	public static void main(String[] args) throws IOException  {
		//String path = "AulaLP.txt";
		Path dir = Paths.get("C:", "teste");

		
		Path path = dir.resolve("AulaLP.doc");
		
		System.out.println(path);
		ManipuladorArquivo.escritor(path.toString());
		//ManipuladorArquivo.leitor(path.toString());

	}

}
