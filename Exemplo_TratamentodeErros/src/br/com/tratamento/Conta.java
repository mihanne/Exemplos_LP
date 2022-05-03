package br.com.tratamento;

public class Conta {
	double saldo, limite;

	Conta(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar (double quantidade) throws IllegalArgumentException{
		if (quantidade > (this.saldo + this.limite)) {
			throw new IllegalArgumentException();
			
			}
		else {
			this.saldo = (this.saldo - quantidade);
			return true;}
		}
}
