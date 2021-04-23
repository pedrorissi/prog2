package ooavc;

public class Conta {
	int numero;
	private String nome;
	private double saldo;
	private double limite;
	
	void sacar(double valor) {
//		double saldoAlterado = saldo - valor;
//		saldo = saldoAlterado;
		saldo = saldo - valor;
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}

	
}

