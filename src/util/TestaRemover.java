package util;

import java.sql.SQLException;

import model.Contato;
import model.ContatoDAO;

public class TestaRemover {
	public static void main(String[]args) throws SQLException{
		ContatoDAO dao=new ContatoDAO();
		Contato contato= new Contato();
		contato.setId(4);
		dao.removeContato(contato);
	}
}
