package br.fiap.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fiap.entidade.Categoria;
import br.fiap.entidade.Produto;

public class ProdutoDAO extends DAO {
	
	public List<Produto> listar() {
		List<Produto> lista = new ArrayList<Produto>();
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		Produto produto;
		Categoria categoria;
		sql = "select P.nome, P.descricao, P.preco, C.categoria from java_produto P, "
				+ "java_categoria C where P.categoria_id = C.categoria_id order by P.nome";
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				categoria = new Categoria();
				categoria.setCategoria(rs.getString("categoria"));
				produto = new Produto();
				produto.setNome(rs.getString("nome"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setPreco(rs.getDouble("preco"));
				produto.setCategoria(categoria);
				lista.add(produto);
			}
			ps.close();
			conexao.desconectar();
		} catch (SQLException e) {
			System.out.println("Erro ao listar produto\n"+e);
		}
		
		return lista;
	}
	
	public void inserir(Produto produto) {
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		sql = "insert into java_produto values(produto_sequence.nextval, "
				+ "?, ?, ?, ?)";
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, produto.getCategoria().getCategoria_id());
			ps.setString(2, produto.getNome());
			ps.setString(3, produto.getDescricao());
			ps.setDouble(4, produto.getPreco());
			ps.execute();
			ps.close();
			conexao.desconectar();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir produto\n"+e);
		}
	}
}
