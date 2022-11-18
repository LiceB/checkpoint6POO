package br.fiap.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.ProdutoDAO;
import br.fiap.entidade.Categoria;
import br.fiap.entidade.Produto;

/**
 * Servlet implementation class CadastroProduto
 */
@WebServlet(name = "cadastroProduto", urlPatterns = { "/cadastroProduto" })
public class CadastroProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroProduto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		Double preco = Double.parseDouble(request.getParameter("preco"));
		Integer id = Integer.parseInt(request.getParameter("categoria"));
		
		Categoria categoria = new Categoria();
		categoria.setCategoria_id(id);
		
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		produto.setCategoria(categoria);
		new ProdutoDAO().inserir(produto);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("listarProduto.jsp");
		dispatcher.forward(request, response);
	}

}
