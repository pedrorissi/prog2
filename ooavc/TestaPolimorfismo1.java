package ooavc;

public class TestaPolimorfismo1 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		double salfunc = f1.getSalario();
		System.out.println("O salário do funcionário é: " + salfunc);
		System.out.println("O bonus do funcionário f1 é: " + f1.getBonus());
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println("O salário do gerente é: " + g1.getSalario());
		System.out.println("O bonus do gerente g1 é: " + g1.getBonus());
		
		
	}
}
