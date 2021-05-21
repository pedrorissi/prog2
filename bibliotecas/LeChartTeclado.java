package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeChartTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma única tecla: ");
		
		InputStream is = System.in;/*in -> variável implícita. Por definição a entrada padrão do sistema é o teclado. Sempre que o System.io for acionado a entrada padrão será do teclado.*/
		/*InputStream: classe que sabe capturar um byte de entrada*/
		InputStreamReader isr = new InputStreamReader(is);
		
		char c;
		try {
			c = (char) isr.read();
			System.out.println("Você digitou a tecla: " + c);
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
}
