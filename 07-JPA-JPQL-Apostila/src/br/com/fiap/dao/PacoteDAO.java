package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	 List<Pacote> BuscarPorDatas(Calendar inicio, Calendar fim);
	
}
