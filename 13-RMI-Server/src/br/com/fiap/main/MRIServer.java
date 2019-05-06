package br.com.fiap.main;

import java.io.ObjectOutputStream;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.bo.CalculadoraBO;
import br.com.fiap.bo.impl.CalculadoraBOImpl;

public class MRIServer {
	public static void main(String[] args) throws Exception {
		//registrar objeto remoto
		CalculadoraBO bo = new CalculadoraBOImpl();
		
		Registry registy = LocateRegistry.createRegistry(1014);
		
		
		registy.bind("chave", bo);
		
		System.out.println("Objetoc remoto Registrado!");
	}
}
