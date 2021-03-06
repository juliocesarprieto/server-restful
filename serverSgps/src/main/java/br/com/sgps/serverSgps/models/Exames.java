package br.com.sgps.serverSgps.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "exames")
public class Exames implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXA_ID")
	private Integer exaId;
	
	private String exaNome;
	
	@Column(name = "EXA_OBS")
	private String exaObservacao;
	
	@ManyToOne
	@JoinColumn(name = "FK_CLIENTE", referencedColumnName = "CLI_ID")
	private Clientes cliente;
	
	public Exames() {}

	public Exames(Integer exaId, String exaNome, String exaObservacao, Clientes cliente) {
		super();
		this.exaId = exaId;
		this.exaNome = exaNome;
		this.exaObservacao = exaObservacao;
		this.cliente = cliente;
	}

	public Integer getExaId() {
		return exaId;
	}

	public void setExaId(Integer exaId) {
		this.exaId = exaId;
	}

	public String getExaNome() {
		return exaNome;
	}

	public void setExaNome(String exaNome) {
		this.exaNome = exaNome;
	}

	public String getExaObservacao() {
		return exaObservacao;
	}

	public void setExaObservacao(String exaObservacao) {
		this.exaObservacao = exaObservacao;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}	
	
}
