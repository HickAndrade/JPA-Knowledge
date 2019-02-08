package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.beans.Animal;

public class Teste {
	public static void main(String[] args) {
	//Instanciar um animal
		Animal animal = new Animal();
		
		//API Reflection: recupera toda a estrutura da classe
		//exibir o nome da classe
		System.out.println(animal.getClass().getSimpleName());
		
		//recuperar os metodos a classe animal 
		System.out.println("METODOS: ");
		Method[] metodos = animal.getClass().getDeclaredMethods();
		
		
		//For each recupera o nome dos metodos 
		for (Method m : metodos) {
			System.out.println(m.getName());
			
		}
		//recuperar e exibir os atributos da classe animal
		System.out.println("ATRIBUTOS: ");
		Field[] atributos =  animal.getClass().getDeclaredFields();
		
		for (int i = 0; i < atributos.length; i++) {
			System.out.println(atributos[i].getName());
			
			//recuperar Anotação @Coluna
			Coluna a = atributos[i].getAnnotation(Coluna.class);
			
			System.out.println("Campo: "+ a.nome());
			System.out.println("Obrigatorio: "+ a.nullable());	
	}
		
		
		
		
	}}
