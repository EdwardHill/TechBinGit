package view;

import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import model.ContatoDAO;

public final class ContextListener implements ServletContextListener {
	private ServletContext context=null;
	
	@Override
	
	//fecha conexão com o bando de dadods
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		context = event.getServletContext();
		ContatoDAO contatoDAO = (ContatoDAO) context.getAttribute("contatoDAO");
		contatoDAO.fechar();
		context.removeAttribute("contatoDAO");
	}

	@Override
	//Abre conexão com o bando de dados
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		context = event.getServletContext();
		try {
			context.setAttribute("contatoDAO", new ContatoDAO());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
