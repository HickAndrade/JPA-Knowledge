package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	Long countByEstado(String estado);
	
	List<Cliente> Clientes();
		
	List<Cliente> RetornarPorNome(String nome);
	
	List<Cliente> Buscar(String nome, String cidade);
	
	List<Cliente>BuscarPorEstados(List<String> estados);
	
	
}
