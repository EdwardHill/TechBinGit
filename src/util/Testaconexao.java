package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class Testaconexao {
	
 public static void main(String args[]){
	 	
		 // conectando       
	 	Connection con;
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement smt = con.prepareStatement("insert into contato"
				 	+ "(nome,email,mensagem) values (?,?,?)");
				 	smt.setString(1, "Soraya");
				 	smt.setString(2, "Sorayagata@hotmai.com");
				 	smt.setString(3,"Ou não");
				 	smt.execute();
				 	System.out.println("Insediro");
				 	smt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	
	 	}
	
 	}


 
 	

 
