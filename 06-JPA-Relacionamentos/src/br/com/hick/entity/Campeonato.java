package br.com.hick.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_CAMPEONATO")
@SequenceGenerator(name= "camp", sequenceName = "SQ_T_CAMPEONATO",allocationSize = 1)
public class Campeonato {
	
	
	@Id
	@GeneratedValue(generator="camp",strategy=GenerationType.SEQUENCE)
	@Column(name = "cd_campeonato", nullable = false)
	private int codigo;
	
	@Column(name = "nm_campeonato", nullable = false)
	private String nome;
	
	@Column(name = "vl_premiacao", nullable = false)
	private double premiacao;

	public Campeonato(int codigo, String nome, double premiacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.premiacao = premiacao;
	}

	public Campeonato() {
		super();
	}

	public Campeonato(String nome, double premiacao) {
		super();
		this.nome = nome;
		this.premiacao = premiacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}

	
	
}
