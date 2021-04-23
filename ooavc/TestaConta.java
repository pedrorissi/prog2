package ooavc;

public class TestaConta {
	public static void main(String[] args) {
		//Operação de declaração
		//Só criamos a referência, o ponteiro
		//Conta c1;
		
		//Operação de Instanciação
		//Agora criamos concretamente a estrutura de uma Conta em memória
		
		//Fazendo declaração e instanciação na mesma linha
		Conta c1 = new ContaPoupanca();
		c1.setNumero(001);
		System.out.println(c1.getNumero());
		
		//Operações de inicialização
		c1.numero = 001;	
		c1.nome = "Matheus";
		c1.saldo = 1000.0;
		c1.limite = 100.0;
		
		System.out.println("Nro conta: " + c1.numero);
		System.out.println("Titular: " + c1.nome);
		System.out.println("Saldo Atual: " + c1.saldo);
		System.out.println("Limite: " + c1.limite);
		
		double valorSaque = 200;
		boolean resultado = c1.sacar(valorSaque);
		//	if(c1.sacar(valorSaque()))
		if(resultado) {
			System.out.println();
			
		} else {
			System.out.println();
		
	}
}
