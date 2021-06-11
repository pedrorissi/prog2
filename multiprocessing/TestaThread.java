package multiprocessing;

public class TestaThread {
	public static void main(String[] args) {
		DesenhaMapa dMapa = new desenhaMapa();
		//Thread tMapa = new Thread((Runnable) dMapa);
		Thread tMapa = new Thread(dMapa);
		
		ProgressBar bProg = new ProgressBar();
		//Thread tProg = new Thread((Runnable) bProg);
		Thread tProg = new Thread(bProg);
		
		tMapa.start();
		tProg.start();
	}
}
