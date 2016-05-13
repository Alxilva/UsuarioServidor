import java.net.*;
import java.io.*;
import java.util.*;

public class Servidor{

	public static void main(String args[]) throws UnknownHostException{
		
	try{
		
		while(true){
			ServerSocket server = new ServerSocket(8080);
			Socket cliente = server.accept();
			PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
			DataInputStream entrada =new DataInputStream(cliente.getInputStream());

			System.out.println("Usuario conectado");
			salida.println("Bienvenido\nOperadores +, -, * y /. \nIntroduce dos numeros a operar separados por un espacio:");
			salida.println("Operacion: \t1. '+' \t2. '-' \t3. 'x'\t4. '/'");

			int num1=  entrada.readInt(); 
			int num2= entrada.readInt();
			int operador= entrada.readInt();
			System.out.println("num1 "+num1+"\tnum2 "+num2+"\toperador"+operador);
				switch(operador){
					case 1: int resultado=num1+num2;
					break;
					case 2:resultado=num1-num2;
					break;
					case 3:resultado=num1*num2;
					break;
					case 4:resultado=num1/num2;
					break;
					default: System.out.println("\t\t\t\tINTRODUCE UNA OPCION VALIDA\n\n\n\n");
					break;	

				}
			//salida.println("Resultado:" + resultado);

		}

	}catch(IOException e){
		System.out.println("No hay flujo...");
	}

	}
}