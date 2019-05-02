package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@DiscriminatorValue("Mamifero")

@Entity
public class Mamifero extends Animal{
	
	@Column(name = "ds_gestacao")
	private int TempoGestacao;
	
	@Column(name = "st_pelos")
	private boolean pelos;
	
	
	
	
	
	
	public Mamifero(int codigo, String nome, String cor, int tempoGestacao, boolean pelos) {
		super(codigo, nome, cor);
		TempoGestacao = tempoGestacao;
		this.pelos = pelos;
	}
	public Mamifero() {
		super();
	}
	public Mamifero(String nome, String cor, int tempoGestacao, boolean pelos) {
		super(nome, cor);
		TempoGestacao = tempoGestacao;
		this.pelos = pelos;
	}
	public int getTempoGestacao() {
	return TempoGestacao;
	}
	public void setTempoGestacao(int tempoGestacao) {
		TempoGestacao = tempoGestacao;
	}
	public boolean isPelos() {
		return pelos;
	}
	public void setPelos(boolean pelos) {
		this.pelos = pelos;
	}
	
	
	
}
