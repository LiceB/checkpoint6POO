package br.fiap.entidade;

public class Detalhe {
	private Integer id;
	private Pedido pedido_id;
	private Produto produto_id;
	private Integer quantidade;
	private Double total;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pedido getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Pedido pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Produto getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Produto produto_id) {
		this.produto_id = produto_id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
