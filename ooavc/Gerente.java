package ooavc;

public class Gerente extends Funcionario{
	int senha;

	public boolean verifica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Autorizado");
			return true;
		} else {
			System.out.println("Acesso Negado!!");
			return false;
		}

		//
		//		double getBonus(){
		//			return this.salario * 0.15;
		//		}
		//v4 do bonus: percent de funcionário comum mais um valor fixo: por exemplo de R$5000 para o gerente, R$10000 para o diretor, etc...
		double getBonus() {
			return this.salario * 0.05 + 5000;
//			return super.getBonus() + 5000;
		}
	}
}
