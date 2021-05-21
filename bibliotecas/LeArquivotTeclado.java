package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivotTeclado {
	public static void main(String[] args) {
		//System.out.println("Digite uma mensagem: ");
		
		InputStream is = System.in;/*in -> vari�vel impl�cita. Por defini��o a entrada padr�o do sistema � o teclado. Sempre que o System.io for acionado a entrada padr�o ser� do teclado.*/
		/*InputStream: classe que sabe capturar um byte de entrada*/
		InputStreamReader isr = new InputStreamReader(is);
		/*ISR sabe receber um byte e transform�-lo em char*/
		BufferedReader br = new BufferedReader(isr);
		
		/*BR sabe receber v�rios char e armazena-los num buffer, transformando-os em String*/
		
		String s;
		try {
			s =br.readLine();
			System.out.println("Voc� digitou a mensagem: " + s);
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();
			isr.close();
			is.close();
			
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 
}
