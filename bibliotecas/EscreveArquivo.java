package bibliotecas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class EscreveArquivo {
	public static void main(String[] args) {
		// System.out.println("Digite uma mensagem: ");

		try {
			OutputStream os = System.out;/*
											 * in -> vari�vel impl�cita. Por defini��o a entrada padr�o do sistema � o
											 * teclado. Sempre que o System.io for acionado a entrada padr�o ser� do
											 * teclado.
											 */
			/* InputStream: classe que sabe capturar um byte de entrada */
			OutputStreamWriter osw = new OutputStreamWriter(os);
			/* ISR sabe receber um byte e transform�-lo em char */
			BufferedWriter br = new BufferedWriter(osw);

			/*
			 * BR sabe receber v�rios char e armazena-los num buffer, transformando-os em
			 * String
			 */

			/*
			 * String s; s =br.readLine(); System.out.println("Voc� digitou a mensagem: " +
			 * s); while(s != null) { System.out.println(s); s = br.readLine(); }
			 * br.close(); osw.close(); is.close();
			 */

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
