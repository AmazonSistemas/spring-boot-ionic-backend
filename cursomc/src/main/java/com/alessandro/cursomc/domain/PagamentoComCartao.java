package com.alessandro.cursomc.domain;

import javax.persistence.Entity;

import com.alessandro.cursomc.domain.enums.EstadoPagamento;

@Entity(name="pagamento_com_cartao")
public class PagamentoComCartao extends Pagamento{

	// Por ser uma Classe que extende Pagamento NÃO precisa do hashCode() pois ja foi realizado na classe mãe
	// Nem da chave pois será a mesma de Pagamento
	
	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcela;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcela) {
		super(id, estado, pedido);
        this.numeroDeParcela = numeroDeParcela;
	}

	public Integer getNumeroDeParcela() {
		return numeroDeParcela;
	}

	public void setNumeroDeParcela(Integer numeroDeParcela) {
		this.numeroDeParcela = numeroDeParcela;
	}
	

}