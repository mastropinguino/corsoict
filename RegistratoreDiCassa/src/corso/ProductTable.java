package corso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.Prodotto;


public class ProductTable {

	
	private final static String SQL_READ_PRODUCT = "SELECT  nome, prezzo, codice FROM prodotti ";
	
	public ArrayList<Prodotto> leggiProdotti() throws SQLException{
		Connection conn = ConnessioneDB.getConnection();
		ArrayList <Prodotto> aux = new ArrayList<>();
		try(Statement stmt = conn.createStatement()){
			try(ResultSet rs = stmt.executeQuery(SQL_READ_PRODUCT)){
				while(rs.next()) {
					Prodotto p = new Prodotto();
					p.setNome(rs.getString("nome"));
					p.setPrezzo(rs.getFloat("prezzo"));
					p.setCodice(rs.getInt("codice"));
					 aux.add(p);
				}
			}
	}
		return aux;
	}
	
	
}



//rs.getInt("nome") + "\t" + rs.getString("prezzo") + "\t" + rs.getInt("codice")