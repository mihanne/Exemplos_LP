package funcoeslambda;

public class Exemplo3Lambda {

	public static void main(String[] args) {
		
			int[] vi = {1, 2, 5, 8, 2};
			ProcessaIntArray h = v -> {
				int s = 0;
				for(int i = 0; i < v.length; i++) s += v[i];
				return s;
			};
			System.out.println(h.computa(vi)); //2
			}
			
			interface ProcessaIntArray{ int computa(int[] v); }

	}
