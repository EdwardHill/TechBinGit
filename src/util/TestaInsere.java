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
			+ " seria que cada uma delas � respons�vel "
			+ "por uma p�gina, sendo que ela l� dados "
			+ "da requisi��o do cliente e responde com "
			+ "outros dados (uma p�gina HTML, uma imagem "
			+ "GIF etc). Como no Java tentamos sempre "
			+ "que poss�vel trabalhar orientado a objetos");
	
	//
	ContatoDAO dao = new ContatoDAO();
	dao.addContato(contato);
	}
}
