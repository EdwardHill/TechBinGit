package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;

public class ContatoDAO {
	private Connection connection;
	
	public ContatoDAO() throws SQLException{
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void addContato(Contato contato) throws SQLException{
		PreparedStatement smt = this.connection.prepareStatement("insert into contato"
			 	+ "(nome,email,mensagem,status) values (?,?,?,?)");
			 	smt.setString(1,contato.getNome());
			 	smt.setString(2, contato.getEmail());
			 	smt.setString(3,contato.getMensagem());
			 	smt.setString(4,"ativo");
			 	//executa
			 	System.out.println("Inserido");
			 	smt.execute();
			 	smt.close();
	}
	public List<Contato> getListaContato() throws SQLException{
		PreparedStatement smt =
				this.connection.prepareStatement("select * from contato where status='ativo'");
				ResultSet rs = smt.executeQuery();
				List<Contato> contatos = new ArrayList<Contato>();
				while (rs.next()){
					// criando Objeto Contato
					Contato contato = new Contato();
					contato.setNome(rs.getString("nome"));
					contato.setEmail(rs.getString("email"));
					contato.setMensagem(rs.getString("mensagem"));
					contatos.add(contato);
				}
				rs.close();
				smt.close();
		return contatos;
	}
	
	public void alterarContato(Contato contato) throws SQLException{
		PreparedStatement smt= connection.prepareStatement("update contato set nome=?, email=?, mensagem=? where id=?");
		smt.setString(1,contato.getNome());
		smt.setString(2, contato.getEmail());
		smt.setString(3,contato.getMensagem());
		smt.setInt(4,contato.getId());
		smt.execute();
		smt.close();
	}
	
	public void removeContato(Contato contato) throws SQLException{
		PreparedStatement smt = connection.prepareStatement("update contato set status='inativo' where id=?");
		smt.setInt(1, contato.getId());
		smt.execute();
		smt.close();
	}
	public Contato pesContato(Contato contato) throws SQLException{
		PreparedStatement smt = connection.prepareStatement("select * from contato where id=?");
		smt.setInt(1,contato.getId());
		ResultSet rs= smt.executeQuery();
		if(rs.next()){
			
		contato.setNome(rs.getString("nome"));
		contato.setEmail(rs.getString("email"));
		contato.setMensagem(rs.getString("mensagem"));
		}
		
		smt.execute();
		smt.close();
		return contato;
		
	}
	
	public void fechar(){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fechado");
	}
}
