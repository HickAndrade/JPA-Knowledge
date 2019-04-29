package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table
@Entity(name = "T_CONSULTA")
@IdClass(ConsultaPK.class)
public class Consulta {

	
	
	@Column(name = "nr_crm")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Medico crm;
	
	
	@Column(name = "cd_paciente")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Paciente paciente;
	

	@Column(name = "vl_consulta")
	private double valor;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar consulta;

	@Column(name = "st_convenio")
	private boolean convenio;
	
	
	
	
	
	public Consulta() {
		super();
	}

	public Consulta(Medico crm, Paciente paciente, double valor, Calendar consulta, boolean convenio) {
		super();
		this.crm = crm;
		this.paciente = paciente;
		this.valor = valor;
		this.consulta = consulta;
		this.convenio = convenio;
	}

	public Medico getCrm() {
		return crm;
	}

	public void setCrm(Medico crm) {
		this.crm = crm;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getConsulta() {
		return consulta;
	}

	public void setConsulta(Calendar consulta) {
		this.consulta = consulta;
	}

	public boolean isConvenio() {
		return convenio;
	}

	public void setConvenio(boolean convenio) {
		this.convenio = convenio;
	}
	
	
	
}
