package br.com.fiap.main;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.entity.Vingador;

public class ServerSocketTeste {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(1014);
		//Aguardar conexao e vler o objeto vingador
		System.out.println("Aguardando conexao...");
		Socket socket = server.accept();
		
		ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
		//Ler o objeto e exibir informações
		Vingador v = (Vingador) input.readObject();
		System.out.println("nome: "+v.getNome());
		System.out.println("Poder"+v.getPoder());
		System.out.println("Digno: "+(v.isDigno()?"Sim":"Não"));
		
		socket.close();
		input.close();
	}
}
