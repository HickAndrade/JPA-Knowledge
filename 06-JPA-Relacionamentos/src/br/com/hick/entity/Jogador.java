package br.com.hick.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_JOGADOR")
@SequenceGenerator(name = "jogador", sequenceName = "SQ_T_JOGADOR", allocationSize = 1)
public class Jogador {
	
	
	@Id
	@GeneratedValue(generator="jogador",strategy =GenerationType.SEQUENCE)
	@Column(name = "cd_jogador", nullable = false)
	private int codigo;
	
	@ManyToOne
	@JoinColumn (name="cd_time")
	private Time time;
	
	@Column(name = "nm_jogador", nullable = false, length = 100)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tp_posicao", nullable = false)
	private Posicao posicao;

	public Jogador(int codigo, Time time, String nome, Posicao posicao) {
		super();
		this.codigo = codigo;
		this.time = time;
		this.nome = nome;
		this.posicao = posicao;
	}

	public Jogador(Time time, String nome, Posicao posicao) {
		super();
		this.time = time;
		this.nome = nome;
		this.posicao = posicao;
	}

	public Jogador() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	
	
}
