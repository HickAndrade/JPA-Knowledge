package br.com.fiap.dao;

import br.com.fiap.entity.Motorista;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.Error404;

public interface MotoristaDAO {
	void cadastrar(Motorista motorista);
	
	Motorista Consultar(int codigo);
	
	void Atualizar(Motorista motorista);
	
	void deletar(int codigo) throws Error404;
	
	void commit() throws CommitException;
	
	
}
