package br.com.fiap.entity;

import java.io.Serializable;

public class LocacaoPK implements Serializable {

	private static final long serialVersionUID = -3975426579248249619L;
	private int locacao;
	private int imovel;
	private int cliente;

	public int getLocacao() {
		return locacao;
	}

	public void setLocacao(int locacao) {
		this.locacao = locacao;
	}

	public int getImovel() {
		return imovel;
	}

	public void setImovel(int imovel) {
		this.imovel = imovel;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cliente;
		result = prime * result + imovel;
		result = prime * result + locacao;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocacaoPK other = (LocacaoPK) obj;
		if (cliente != other.cliente)
			return false;
		if (imovel != other.imovel)
			return false;
		if (locacao != other.locacao)
			return false;
		return true;
	}

}
