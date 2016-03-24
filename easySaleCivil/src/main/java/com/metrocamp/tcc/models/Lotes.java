package com.metrocamp.tcc.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "esc_lotes")
public class Lotes implements Serializable{
	
	private static final long serialVersionUID = 4678024610932259072L;

	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "cod_lote", nullable = false)
	private String codLote;
	
	@Column(name = "area_lote")
	private BigDecimal areaLote;
	
	@Column(name = "preco_lote")
	private BigDecimal precoLote;
	
	@Column(name = "valor_entrada")
	private BigDecimal valorEntrada;
	
	@Column(name = "qtd_parcelas")
	private int qtdParcelas;
	
	@OneToOne
	@JoinColumn(name = "cod_corretora", referencedColumnName = "cod_corretora", nullable = false)
	private Corretora corretora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodLote() {
		return codLote;
	}

	public void setCodLote(String codLote) {
		this.codLote = codLote;
	}

	public BigDecimal getAreaLote() {
		return areaLote;
	}

	public void setAreaLote(BigDecimal areaLote) {
		this.areaLote = areaLote;
	}

	public BigDecimal getPrecoLote() {
		return precoLote;
	}

	public void setPrecoLote(BigDecimal precoLote) {
		this.precoLote = precoLote;
	}

	public BigDecimal getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(BigDecimal valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}

	public Corretora getCorretora() {
		return corretora;
	}

	public void setCorretora(Corretora corretora) {
		this.corretora = corretora;
	}	
	
}
