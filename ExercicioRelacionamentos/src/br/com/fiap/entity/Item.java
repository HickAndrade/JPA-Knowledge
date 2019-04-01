package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_ITEM_TESTE")
@SequenceGenerator(name = "item", sequenceName = "SQ_T_ITEM", allocationSize = 1)
public class Item {

	@Id
	@Column(name = "COD_ITEM_TESTE", nullable = false)
	@GeneratedValue(generator = "item", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "DES_ITEM_TESTE", length = 20)
	private String descricao;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "co_caso_teste")
	private Caso caso;

	@ManyToMany
	@JoinTable(name = "TAB_ITEM_TESTE_USUARIO", joinColumns = @JoinColumn(name = "COD_ITEM_TESTE"), inverseJoinColumns = @JoinColumn(name = "COD_USUARIO"))
	private List<Usuario> usuarios;

	public Caso getCaso() {
		return caso;
	}

	public void setCaso(Caso caso) {
		this.caso = caso;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Item(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Item() {
		super();
	}

	public Item(String descricao) {
		super();
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
