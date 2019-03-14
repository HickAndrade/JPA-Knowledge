package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
@SequenceGenerator(name="pagamento",sequenceName="SQ_T_PAGAMENTO", allocationSize = 1)
public class Pagamento {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pagamento")
	@Column(name="cd_pagamento", nullable = false)
	private int pagamento;
	
	@Column(name="dt_pagamento", nullable = false)
	private Calendar data;
	
	@Column(name="vl_pagamento", nullable = false)
	private double valor;
	
	@Column(name="ds_forma_pagamento", nullable = false)
	private PayForm formaPagamento;
	
	
}
