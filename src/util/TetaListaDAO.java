package util;

import java.sql.SQLException;
import java.util.List;

import model.Contato;
import model.ContatoDAO;

public class TetaListaDAO {
	public static void main(String args[]) throws SQLException{
	// criando contato dao
	ContatoDAO dao = new ContatoDAO();
	//lista de contatos
	List<Contato> contatos =dao.getListaContato();
	 for(Contato c :contatos){
		 System.out.println("Nome:"+c.getNome());
		 System.out.println("Email: "+c.getEmail());
		 System.out.println("Mensagem: "+c.getMensagem());
	 }
	
 	}
}
