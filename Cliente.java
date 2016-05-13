import java.net.*;
import java.io.*;
import java.util.*;

public class Cliente{

	public static void main(String args[]) throws UnknownHostException{
		

	try{
		Socket cliente = new Socket("127.0.0.1", 8080);
		Scanner in = new Scanner(cliente.getInputStream());	
		PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
		DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());

		out.println("get index.html");
		System.out.println(in.nextLine());
		System.out.println(in.nextLine());
		System.out.println(in.nextLine());

		Scanner numero = new Scanner(System.in);
  		int num1= numero.nextInt(); 
  		System.out.println("num1"+num1);
  		
  		Scanner numeo = new Scanner(System.in);
		int num2= numeo.nextInt();
		System.out.println("num2"+num2);

		do{
			salida.writeInt(num1);
			salida.writeInt(num2);		
		}while (num1!=0);

		System.out.println(in.nextLine());
		int operador= numero.nextInt(); salida.writeInt(operador);
		System.out.println("numq1"+num1+"num2"+num2+"operador"+operador);
		

		System.out.println(in.nextLine());

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