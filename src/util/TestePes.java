package util;

import java.sql.SQLException;

import model.Contato;
import model.ContatoDAO;

public class TestePes {
	public static void main(String[]args) throws SQLException{
		ContatoDAO dao= new ContatoDAO();
		Contato contato= new Contato();
		
		contato.setId(4);
		Contato resu =new Contato();
		resu=dao.pesContato(contato);
		
		System.out.println(resu);
		

	}
	
}
