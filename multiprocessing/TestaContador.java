package multiprocessing;

public class TestaContador {
	public static void main(String[] args) {
		Contador2 c1 = new Contador2();
		c1.setCont(1);
		Thread t1 = new Thread(c1);
		//c1.contar();
		t1.start();
		
		Contador2 c2 = new Contador2();
		c2.setCont(2);
		Thread t2 = new Thread(c1);
		//c2.contar();
		t2.start();
		
		Contador2 c3 = new Contador2();
		c3.setCont(2);
		Thread t3 = new Thread(c1);
		//c3.contar();
		t3.start();
		
		Contador2 c4 = new Contador2();
		c4.setCont(2);
		Thread t4 = new Thread(c1);
		//c4.contar();
		t4.start();
	
	
	}
}
