package br.fiap.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fiap.entidade.Categoria;

public class CategoriaDAO extends DAO {
	
	public List<Categoria> listar() {
		List<Categoria> lista = new ArrayList<Categoria>();
		Conexao conexao = new Conexao();
		connection = conexao.conectar();
		Categoria categoria;
		sql = "select * from java_categoria";
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				categoria = new Categoria();
				categoria.setCategoria_id(rs.getInt("categoria_id"));
				categoria.setCategoria(rs.getString("categoria"));
				lista.add(categoria);
			}
			ps.close();
			conexao.desconectar();
		} catch (SQLException e) {
			System.out.println("Erro ao listar categoria\n"+e);
		}
		
		return lista;
	}
	
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
