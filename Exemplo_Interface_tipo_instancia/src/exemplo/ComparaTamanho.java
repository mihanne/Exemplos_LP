package exemplo;

public class ComparaTamanho implements Comparator <String>{
	public int compare(String first , String second) {
		return first.length();
	}
	}
