package corso;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ScontrinoTable {
	class Scontrino{
		int id;
		float totale;
		Date data;
		int iva;
		int negozio;
	}
	
	private final static String SQL_READ_SCONTRINO = "SELECT  id, totale, data_ora, iva, negozio FROM scontrini ";
	
	public ArrayList<Scontrino> leggiProdotti() throws SQLException{
		Connection conn = ConnessioneDB.getConnection();
		ArrayList <Scontrino> aux = new ArrayList<>();
		try(ResultSet rs = conn.createStatement().executeQuery(SQL_READ_SCONTRINO)){
			while(rs.next()) {
				Scontrino s = new Scontrino();
				s.id = rs.getInt("id");
				s.totale = rs.getFloat("totale");
				s.data = rs.getDate("data_ora");
				s.iva = rs.getInt("iva");
				s.negozio = rs.getInt("negozio");
				 aux.add(s);
			}
		}
		return aux;
	}
	

}
