package corso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductTable {

	
	class Prodotto{
		String nome;
		float prezzo;
		int codice;
	}
	
	private final static String SQL_READ_PRODUCT = "SELECT  nome, prezzo, codice FROM prodotti ";
	
	public ArrayList<Prodotto> leggiProdotti() throws SQLException{
		Connection conn = ConnessioneDB.getConnection();
		ArrayList <Prodotto> aux = new ArrayList<>();
		try(ResultSet rs = conn.createStatement().executeQuery(SQL_READ_PRODUCT)){
			while(rs.next()) {
				Prodotto p = new Prodotto();
				p.nome = rs.getString("nome");
				p.prezzo = rs.getFloat("prezzo");
				p.codice = rs.getInt("codice");
				 aux.add(p);
			}
		}
		return aux;
	}
	
	
}



//rs.getInt("nome") + "\t" + rs.getString("prezzo") + "\t" + rs.getInt("codice")