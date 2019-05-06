package br.com.fiap.main;

import java.io.ObjectOutputStream;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.bo.CalculadoraBO;

public class MRIClientTeste {
	public static void main(String[] args) throws Exception {

		//Porque precisa fazer esse cast?
		
		CalculadoraBO bo = (CalculadoraBO) Naming.lookup("rmi://localhost:1014/chave");
		
		double soma = bo.somar(10, 10);
		System.out.println("Soma "+ soma);
		
		int fatorial = bo.fatorial(25);
		System.out.println("Fatorial: " + fatorial);
		
	
	}
}
