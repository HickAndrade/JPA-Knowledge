package br.com.fiap.main;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.entity.Vingador;

public class Client {
	public static void main(String[] args)throws Exception {
		//Criar um objeto e serializar na rede
		
		Vingador heroi = new  Vingador("faz chamada","serioOOOO", false);
		
		Socket socket = new Socket("10.3.5.25",1014);
		
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		
		output.writeObject(heroi);
		System.out.println("objeto Serializado na rede!");
		
		output.close();
		socket.close();
	}
	
}
