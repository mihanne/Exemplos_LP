package exemplo;

public class SequenciaQuadrada implements IntSequenciaInteira {
	private int i = 0;
	
	public boolean possuiProximo() {
		return true;
	}
	public int proximo() {
		i++;
		return i*i;
}
}
