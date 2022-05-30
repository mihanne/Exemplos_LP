package exemploIO;
import java.io.IOException;

public class readBytes {

	public static void main(String[] args) throws IOException
	{
		byte data[] = new byte[10];
		System.out.println("Digite alguns caracteres: ");
		System.in.read(data);
		System.out.print("Sua Entrada de tamanho: " + data.length+ "\n");
		
		for(int i=0; i < data.length; i++) {
			System.out.print((char) data[i]);
		}
		}
	}
