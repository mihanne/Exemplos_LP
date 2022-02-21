package tiposVariaveis;

public class ExemploTempoVidaVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		for(x = 0; x < 3; x++) {
			int y = -1; // y sera inicializada sempre que entrarmos no bloco 
			System.out.println("y is: " + y); // essa linha sempre exibe -1
			y = 100;
			System.out.println("y is now: " + y);
		}
	}

}
