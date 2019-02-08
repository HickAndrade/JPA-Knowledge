package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.beans.Animal;

public class Exercicio {
public static void main(String[] args) {
	
	Animal animal = new Animal();
	
	//
	Tabela anotacao = animal.getClass().getAnnotation(Tabela.class);
	
	System.out.println("SELECT * FROM "+ anotacao.nome());
}
}
