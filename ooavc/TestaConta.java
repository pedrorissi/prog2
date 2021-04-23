package ooavc;

public class TestaConta {
	public static void main(String[] args) {
		//Opera��o de declara��o
		//S� criamos a refer�ncia, o ponteiro
		//Conta c1;
		
		//Opera��o de Instancia��o
		//Agora criamos concretamente a estrutura de uma Conta em mem�ria
		
		//Fazendo declara��o e instancia��o na mesma linha
		Conta c1 = new ContaPoupanca();
		c1.setNumero(001);
		System.out.println(c1.getNumero());
		
		//Opera��es de inicializa��o
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
