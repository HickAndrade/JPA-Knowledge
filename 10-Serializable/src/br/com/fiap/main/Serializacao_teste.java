package br.com.fiap.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.entity.Predio;

public class Serializacao_teste {
	public static void main(String[] args) throws Exception {

		// Serializar um produto
		// Gravar o estado do objeto em um arquivo
		Predio predio = new Predio(8, true, 24);

		FileOutputStream file = new FileOutputStream("predio.txt");

		ObjectOutputStream output = new ObjectOutputStream(file);

		output.writeObject(predio);
		System.out.println("Predio serializado!");
		output.close();
		file.close();
	}

}
