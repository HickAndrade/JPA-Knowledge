package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "DS_TIPO")
@DiscriminatorValue("A")



@Entity
@Table(name = "T_ANIMAL")
@SequenceGenerator(name="animal", allocationSize = 1,sequenceName = "T_SQ_ANIMAL")
public class Animal {

	@Id
	@GeneratedValue(generator = "animal", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_ANIMAL")
	private int codigo;
	
	@Column(name = "NM_ANIMAL", nullable = false)
	private String nome;
	
	@Column(name = "DS_COR", nullable = false)
	private String cor;


	
	
	public Animal() {
		super();
	}

	
	public Animal(String nome, String cor) {
		super();
		this.nome = nome;
		this.cor = cor;
	}


	public Animal(int codigo, String nome, String cor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cor = cor;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
}

