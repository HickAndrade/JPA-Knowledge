package br.com.fiap.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.fiap.entity.Predio;

public class Desserializacao {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("predio.txt");
		ObjectInputStream input = new ObjectInputStream(file);
				
		Predio predio = (Predio) input.readObject();
		
		
		System.out.println("Andares: " +predio.getAndares());
		

		System.out.println("Altura " +predio.getAltura());
		
		System.out.println("Elevador: "+(predio.isElevador()?"SIM":"NAO"));
		
		
	}
}
