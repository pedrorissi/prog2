package programacaoRedes;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Servidor {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(10000);
		/*Aconselhável selecionar portas com valores >1000, pois pode ter outro tipo de serviço rodando no SO*/
		System.out.println("Porta 10000 aberta, aguardando conexão com o cliente.");
		
		Socket client = server.accept();
		System.out.println("Conexão do cliente" + client.getInetAddress().getHostAddress());
		
		Scanner s = new Scanner(client.getInputStream());
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
		s.close();
		client.close();
		server.close();
	}
}
