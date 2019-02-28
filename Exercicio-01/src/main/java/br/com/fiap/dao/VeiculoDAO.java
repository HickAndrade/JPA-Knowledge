package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.Error404;

public interface VeiculoDAO {
		
	void cadastrar(Veiculo veiculo);
	
	Veiculo consultar(int codigo);
	
	void atualizar (Veiculo veiculo);
	
	void deletar(int codigo) throws Error404;
	
	void commit() throws CommitException;
}
