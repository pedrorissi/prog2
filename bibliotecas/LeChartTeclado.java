package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeChartTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma �nica tecla: ");
		
		InputStream is = System.in;/*in -> vari�vel impl�cita. Por defini��o a entrada padr�o do sistema � o teclado. Sempre que o System.io for acionado a entrada padr�o ser� do teclado.*/
		/*InputStream: classe que sabe capturar um byte de entrada*/
		InputStreamReader isr = new InputStreamReader(is);
		
		char c;
		try {
			c = (char) isr.read();
			System.out.println("Voc� digitou a tecla: " + c);
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
}
