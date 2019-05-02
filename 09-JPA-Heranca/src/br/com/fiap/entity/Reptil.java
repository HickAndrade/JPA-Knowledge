package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@DiscriminatorValue("Reptil")


@Entity
public class Reptil extends Animal {

	@Column(name = "st_venenoso")
	private boolean venenoso;
	
	@Column(name = "st_escamas")
	private boolean escamas;
	
	
	
	
	public Reptil(int codigo, String nome, String cor, boolean venenoso, boolean escamas) {
		super(codigo, nome, cor);
		this.venenoso = venenoso;
		this.escamas = escamas;
	}
	public Reptil() {
		super();
	}
	public Reptil(String nome, String cor, boolean venenoso, boolean escamas) {
		super(nome, cor);
		this.venenoso = venenoso;
		this.escamas = escamas;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public boolean isEscamas() {
		return escamas;
	}
	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}
	
	
	
}
