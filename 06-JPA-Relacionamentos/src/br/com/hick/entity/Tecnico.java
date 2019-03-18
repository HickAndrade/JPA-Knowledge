package br.com.hick.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "T_TECNICO")
@SequenceGenerator(name="tecnico", sequenceName = "SQ_T_TECNICO", allocationSize = 1)
public class Tecnico {
	
	@Id
	@GeneratedValue(generator = "tecnico", strategy =GenerationType.SEQUENCE)
	@Column(name = "cd_tecnico", nullable = false)
	private int codigo;
	
	@OneToOne(mappedBy="tecnico")
	@JoinColumn(name = "cd_time")
	private Time time;
	
	@Column(name = "nm_tecnico", nullable = false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
@Column(name = "dt_nascimento", nullable = false)
	private Calendar dataNascimento;
	
	
	
	
}
