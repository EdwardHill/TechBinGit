package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contato;
import model.ContatoDAO;

/**
 * Servlet implementation class ContatoServlet
 */
@WebServlet(name= "ContatoServlet",urlPatterns={"/ContatoServlet"})

public class ContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String nomedocontato;
    
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContatoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Iniciando a servlet");
    }

    public void destroy() {
        super.destroy();
        log("Destruindo a servlet");
    }
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Contato contato = new Contato();
		Contato pesquisa = new Contato();
		
		String nome=request.getParameter("nome");
		String email=request.getParameter("email");
		String mensagem=request.getParameter("mensagem");
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setMensagem(mensagem);
		
		// presuisase mensgagem existe
		
		ContatoDAO dao;
		try {
			dao = new ContatoDAO();
			dao.addContato(contato);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nomedocontato=request.getParameter("nome");
		
		request.setAttribute("nomedocontato",nomedocontato);
		RequestDispatcher rd = request.getRequestDispatcher("MenssagemEv.jsp");
		rd.forward(request, response);
		
		
	}
	
}
