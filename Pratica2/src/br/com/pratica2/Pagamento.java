package br.com.pratica2;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		final Scanner entrada = new Scanner(System.in);
		short formaPagamento;
		double totalGastos;
		short numParcelas;
		
		
		System.out.println("\nDigite o Total Gasto: ");
		totalGastos= entrada.nextDouble();
		solicitaPagamento:
		while (totalGastos!=-1)
		{
			
			
			System.out.println("Escolha a forma de pagamento: ");
			System.out.println(" 1-À Vista a vista com 10 de desconto\n 2-Parcelado 2 x em duas vezes\n 3- Parcelado de 3 até 6 vezes com 3% de juros");
			formaPagamento = entrada.nextShort();
			
			
			switch (formaPagamento)
			{
				case 1:
					System.out.printf("Pagamento com desconto R$ %,.2f ",totalGastos*0.9);
					break;
				
				case 2:
					System.out.printf("Duas parcelas de R$ %,.2f ",totalGastos/2);
					break;
					
				case 3:
					if (totalGastos>=500)
					{
						System.out.println("Digite o número de parcelas entre 3 a 6");
						numParcelas = entrada.nextShort();
						if (numParcelas>=3 & numParcelas<=6)
						{
							System.out.printf("%d parcelas de R$ %,.2f ",numParcelas, (totalGastos/numParcelas)*1.03);
						}
						
						else
						{
							System.out.println("Forma de Pagamento inválida");
							continue solicitaPagamento;
						}
					}
					else {
						System.out.println("Forma de Pagamento inválida");
						continue solicitaPagamento;
					}
					break;
				
				default:
					System.out.println("Opção inválida");
					
					break;
			
			
			}
			System.out.println("\nDigite o Total Gasto: ");
			totalGastos= entrada.nextDouble();	
		}
	System.out.println("Fim do Programa");
	}

}
