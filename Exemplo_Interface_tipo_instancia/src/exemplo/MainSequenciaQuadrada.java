package exemplo;

public class MainSequenciaQuadrada {

	public static void main(String[] args) {
		//IntSequenciaInteira teste = new IntSequenciaInteira();
		IntSequenciaInteira s;
		s = new SequenciaQuadrada ();

		if(s instanceof SequenciaQuadrada) {
		 SequenciaQuadrada sq = (SequenciaQuadrada) s;
		System.out.println(sq.proximo ());
		System.out.println(sq.proximo ());
		System.out.println(s.proximo ());
	}
	}
}
