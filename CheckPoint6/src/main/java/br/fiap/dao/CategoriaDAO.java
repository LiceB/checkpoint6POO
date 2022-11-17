package br.fiap.dao;

import java.sql.SQLException;

import br.fiap.entidade.Categoria;

public class CategoriaDAO extends DAO {
	
	public void inserir(Categoria categoria) {
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		sql = "insert into java_categoria values(categoria_sequence.nextval, ?)";
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, categoria.getCategoria());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir categoria\n"+e);
		}
	}
}
