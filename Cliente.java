import java.net.*;
import java.io.*;
import java.util.*;

public class Cliente{

	public static void main(String args[]) throws UnknownHostException{


	try{
		
		Socket sock = new Socket("127.0.0.1", 8080);
		Scanner in = new Scanner(sock.getInputStream());	
		PrintWriter out = new PrintWriter(sock.getOutputStream(), true);

		out.println("get index.html");
		System.out.println(in.nextLine());
		System.out.println(in.nextLine());
		Scanner numero = new Scanner(System.in);
  		float num1= numero.nextInt(); 
		float num2= numero.nextInt();

	}catch(IOException e){
		System.out.println("No hay flujo...");
	}

	/*try {
		Scanner numero = new Scanner(System.in);
  		float num1= numero.nextInt(); 
		float num2= numero.nextInt();
	}catch(IOException e){
		System.out.println("No hay flujo...");
	}*/
}

}