package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity(name = "T_MEDICO")
@SequenceGenerator(name = "medico", allocationSize = 1,sequenceName = "SQ_T_MEDICO")
public class Medico {

	@Id
	@GeneratedValue(generator = "medico",strategy = GenerationType.SEQUENCE)
	@Column(name = "nr_crm")
	private int crm;

	@Column(name = "nm_medico", nullable = false)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_especialidade" , nullable = false)
	private Especialidade especialidade;
	
	
}
