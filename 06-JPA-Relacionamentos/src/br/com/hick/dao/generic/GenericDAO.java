package br.com.hick.dao.generic;

import br.com.hick.excecao.CommitException;
import br.com.hick.excecao.NotFoundException;

public interface GenericDAO<T,K> {

	void create(T entity);
	T read (K key) throws NotFoundException;
	void update(T entity);
	void delete(K key)throws NotFoundException;
	void commit()throws CommitException;
	
}
