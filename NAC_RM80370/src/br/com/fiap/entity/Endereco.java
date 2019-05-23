package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_NAC_ENDERECO")
@SequenceGenerator(name = "endereco",sequenceName= "SEQ_NAC_ENDERECO",allocationSize = 1)
public class Endereco{

		
		private Imovel imovel;
		private String logradouro;
		private int cep;
		
		
		
		public Endereco(Imovel imovel, String logradouro, int cep) {
			super();
			this.imovel = imovel;
			this.logradouro = logradouro;
			this.cep = cep;
		}
		public Imovel getImovel() {
			return imovel;
		}
		public void setImovel(Imovel imovel) {
			this.imovel = imovel;
		}
		public String getLogradouro() {
			return logradouro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		
		
}
