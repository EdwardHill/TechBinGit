package util;

import java.sql.SQLException;

import model.Contato;
import model.ContatoDAO;

public class TestaInsere {
	public static void main(String[]args) throws SQLException{
	Contato contato = new Contato();
	contato.setNome("Amarildo");
	contato.setEmail("Amarildo@htdc.com.br");
	contato.setMensagem("Uma primeira ideia da servlet"
			+ " seria que cada uma delas é responsável "
			+ "por uma página, sendo que ela lê dados "
			+ "da requisição do cliente e responde com "
			+ "outros dados (uma página HTML, uma imagem "
			+ "GIF etc). Como no Java tentamos sempre "
			+ "que possível trabalhar orientado a objetos");
	
	//
	ContatoDAO dao = new ContatoDAO();
	dao.addContato(contato);
	}
}
