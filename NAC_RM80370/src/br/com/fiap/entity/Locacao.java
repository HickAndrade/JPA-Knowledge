package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="T_LOCACAO")
@IdClass(LocacaoPK.class)
public class Locacao implements Serializable{
	
	private static final long serialVersionUID = 5464323447032071405L;

	@Id
	@SequenceGenerator(name="locacao", allocationSize=1,sequenceName="SEQ_NAC_LOCACAO")
	@GeneratedValue(generator="locacao",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_locacao")
	private int locacao;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_imovel")
	private Imovel imovel;
	
	@Id
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="cd_cliente")
	private Cliente cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_locacao", nullable = false)
	private Calendar data;
	
	@Column(name = "vl_locacao", nullable = false)
	private double valor;

	public Locacao(int locacao, Imovel imovel, Cliente cliente, Calendar data, double valor) {
		super();
		this.locacao = locacao;
		this.imovel = imovel;
		this.cliente = cliente;
		this.data = data;
		this.valor = valor;
	}

	public Locacao() {
		super();
	}
	
	

	public Locacao(Imovel imovel, Cliente cliente, Calendar data, double valor) {
		super();
		this.imovel = imovel;
		this.cliente = cliente;
		this.data = data;
		this.valor = valor;
	}

	public int getLocacao() {
		return locacao;
	}

	public void setLocacao(int locacao) {
		this.locacao = locacao;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	 
		
}
