package br.com.fiap.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
//Mapeando os objetos no banco usando anotaçoes

@Entity
@Table(name = "TB_ZOOLOGICO")
@SequenceGenerator(name = "zoologico", sequenceName = "SQ_T_ZOOLOGICO", allocationSize = 1)
public class Zoologico {

	@Id
	@Column(name = "CD_ZOOLOGICO")
	@GeneratedValue(generator = "zoologico", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "NM_ANIMAL", nullable = false, length = 20)
	private String nome;
	
	@Column(name = "QT_ANIMAIS", nullable = false)
	private int quantidadeAnimais;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "DS_TIPO", nullable = false)
	private Tipo tipoAnimal;

	@Column(name = "HR_ABERTURA", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horaAbertura;

	@Column(name = "HR_FECHAMENTO", nullable = false)
	@Temporal(TemporalType.TIME)
	private	Date horaFechamento;

	@Column(name = "DT_INALGURACAO", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataInalguracao;

	@Column(name = "ST_EMERGENCIA", nullable = false)
	private boolean emergencia;

	@Lob
	@Column(name="fl_logo")
	private byte[] logo;

	@Transient
	private boolean Abertura;

	public Zoologico() {
		super();
	}

	public Zoologico(String nome, int quantidadeAnimais, Tipo tipoAnimal, Date horaAbertura, Date horaFechamento,
			Calendar dataInalguracao, boolean emergencia, byte[] logo) {
		super();
		this.nome = nome;
		this.quantidadeAnimais = quantidadeAnimais;
		this.tipoAnimal = tipoAnimal;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.dataInalguracao = dataInalguracao;
		this.emergencia = emergencia;
		this.logo = logo;
	}

	public Zoologico(int codigo, String nome, int quantidadeAnimais, Tipo tipoAnimal, Date horaAbertura,
			Date horaFechamento, Calendar dataInalguracao, boolean emergencia, byte[] logo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidadeAnimais = quantidadeAnimais;
		this.tipoAnimal = tipoAnimal;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.dataInalguracao = dataInalguracao;
		this.emergencia = emergencia;
		this.logo = logo;
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

	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}

	public void setQuantidadeAnimais(int quantidadeAnimais) {
		this.quantidadeAnimais = quantidadeAnimais;
	}

	public Tipo getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(Tipo tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public Date getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(Date horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public Date getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(Date horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public Calendar getDataInalguracao() {
		return dataInalguracao;
	}

	public void setDataInalguracao(Calendar dataInalguracao) {
		this.dataInalguracao = dataInalguracao;
	}

	public boolean isEmergencia() {
		return emergencia;
	}

	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public boolean isAbertura() {
		return Abertura;
	}

	public void setAbertura(boolean abertura) {
		Abertura = abertura;
	}

	
	
	
	

}
