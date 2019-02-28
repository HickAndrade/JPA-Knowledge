package br.com.fiap.dao;

import br.com.fiap.excecao.CommitException;
import br.com.fiap.excecao.NotFoundException;

public interface GenericDAO<Table,Key> {
	
	void create(Table T);
	
	Table read(Key K)throws NotFoundException;
	
	void update(Table t)throws NotFoundException;

	void delete(Key Key) throws NotFoundException;
	
	void commit() throws CommitException;
		
}
