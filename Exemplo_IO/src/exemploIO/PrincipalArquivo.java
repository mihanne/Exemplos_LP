package exemploIO;
import java.io.IOException;

public class PrincipalArquivo {

	public static void main(String[] args) throws IOException  {
		String path = "teste.txt";

	//	ManipuladorArquivo.escritor(path);
		ManipuladorArquivo.leitor(path);

	}

}
