package corso;


import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import db.Scontrino;


public class ScontrinoTable {
	
	
	private final static String SQL_READ_SCONTRINO = "SELECT  id, totale, data_ora, iva, negozio FROM scontrini ";
	
	public ArrayList<Scontrino> leggiProdotti() throws SQLException{
		Connection conn = ConnessioneDB.getConnection();
		ArrayList <Scontrino> aux = new ArrayList<>();
		try(Statement stmt = conn.createStatement()){
			
			try(ResultSet rs = stmt.executeQuery(SQL_READ_SCONTRINO)){
				while(rs.next()) {
					Scontrino s = new Scontrino();
					s.setId(rs.getInt("id"));
					s.setTotale(rs.getInt("totale"));
					s.setData_ora(rs.getDate("data_ora"));
					s.setIva(rs.getInt("iva"));
					s.setNegozio(rs.getInt("negozio"));
					 aux.add(s);
				}
			}
		}
		return aux;
	}
	

}
