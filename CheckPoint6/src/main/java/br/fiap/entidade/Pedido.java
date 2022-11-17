package br.fiap.entidade;

import java.sql.Date;

public class Pedido {
	private Integer pedido_id;
	private String nome_contato;
	private String endereco_contato;
	private Date data;

	public Integer getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Integer pedido_id) {
		this.pedido_id = pedido_id;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getEndereco_contato() {
		return endereco_contato;
	}

	public void setEndereco_contato(String endereco_contato) {
		this.endereco_contato = endereco_contato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
