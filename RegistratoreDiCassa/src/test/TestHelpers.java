package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import corso.ConnessioneDB;

public class TestHelpers {

	private final static String QUERY_deleteProdotti = "DELETE FROM prodotti WHERE true";
	private final static String QUERY_deleteProdScontrini = "DELETE FROM prodotti_scontrini WHERE true"; 
	private final static String QUERY_deleteScontrini = "DELETE FROM scontrini WHERE true";
	private final static String QUERY_deleteNegozi = "DELETE FROM negozi WHERE true"; 

	private final static String QUERY_insertProdotti = 
			"INSERT INTO `prodotti` (`codice`, `nome`, `note`, `prezzo`) VALUES\r\n" + 
			"(1, '', 'PC Notebook Asus', 500),\r\n" + 
			"(2, '', 'PC Lenovo', 660),\r\n" + 
			"(3, '', 'PC Vaio 2010', 700)";
	
	private final static String QUERY_insertNegozio = 
			"INSERT INTO `negozio` (`id_negozio`, `responsabile`, `citta`) VALUES\r\n" + 
			"(123, 'NomeCognome', 'Pisa')"; 
	
	private final static String QUERY_insertScontrino = 
			"INSERT INTO `scontrini` (`id`, `totale`, `data_ora`, `iva`, `negozio`) VALUES\r\n" + 
			"(4, 800, '2019-09-10 00:00:00', 10, 0),\r\n" + 
			"(5, 1200, '2019-09-01 00:00:00', 10, 0)";
			
	private static final String QUERY_insertProdScontr = 
			"INSERT INTO prodotti_scontrini (id_prodotti, id_scontrino, quantita, prezzo_applicato) VALUES"
			+ "(1, 4, 2, 1000)"
			+ "(2, 4, 1, 660)"
			+ "(3, 4, 1, 700"
			+ "(1, 5, 1, 500)"
			+ "(3, 5, 1, 700)";
	
	private final static String[] QUERY = {
			QUERY_deleteProdotti, 
			QUERY_deleteNegozi, 
			QUERY_deleteScontrini, 
			QUERY_deleteProdScontrini, 
			QUERY_insertProdotti, 
			QUERY_insertNegozio, 
			QUERY_insertScontrino,
			QUERY_insertProdScontr}; 
	
	public static void resetDB() throws SQLException {
		
		Connection conn = ConnessioneDB.getConnection();
		Statement stmt = conn.createStatement();
		
		for (String query : QUERY)
			stmt.executeUpdate(query);
		stmt.close();
		conn.close();
	}
}
