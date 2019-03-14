package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CORRIDA")
public class Corrida {
	@Id
	@Column(name="cd_corrida", nullable= false)
	private int codigo;
	
	@Column(name="ds_origem", length= 150)
	private String origem;
	
	@Column(name="ds_destino", length = 150)
	private String destino;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_corrida")
	private Calendar corrida;
	
	
	@Column(name="vl_corrida", nullable= false)
	private double valor;

	public Corrida(String origem, String destino, Calendar corrida, double valor) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.corrida = corrida;
		this.valor = valor;
	}


	public Corrida() {
		super();
	}


	public Corrida(int codigo, String origem, String destino, Calendar corrida, double valor) {
		super();
		this.codigo = codigo;
		this.origem = origem;
		this.destino = destino;
		this.corrida = corrida;
		this.valor = valor;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public Calendar getCorrida() {
		return corrida;
	}


	public void setCorrida(Calendar corrida) {
		this.corrida = corrida;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
	
	
	
}
