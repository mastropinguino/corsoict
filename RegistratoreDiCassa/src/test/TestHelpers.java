package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import corso.ConnessioneDB;

public class TestHelpers {

	
	private final static String QUERY_createNegozio = 
			"CREATE TABLE IF NOT EXISTS `negozio` (\r\n" + 
			"  `id_negozio` int(11) NOT NULL,\r\n" + 
			"  `responsabile` char(12) DEFAULT NULL,\r\n" + 
			"  `citta` char(12) DEFAULT NULL\r\n" + 
			") ENGINE=InnoDB DEFAULT CHARSET=latin1;\r\n";
	
	private final static String QUERY_createProdotto =
			"CREATE TABLE IF NOT EXISTS `prodotto` (\r\n" + 
			"  `codice` int(11) NOT NULL,\r\n" + 
			"  `nome` varchar(250) NOT NULL,\r\n" + 
			"  `prezzo` float NOT NULL\r\n" + 
			") ENGINE=InnoDB DEFAULT CHARSET=latin1";
	
	private final static String QUERY_createProdotto_Scontrino =
			"CREATE TABLE IF NOT EXISTS `prodotto_scontrino` (\r\n" + 
			"  `id_prodotto` int(11) NOT NULL,\r\n" + 
			"  `id_scontrino` int(11) NOT NULL,\r\n" + 
			"  `quantita` int(11) NOT NULL,\r\n" + 
			"  `prezzo_applicato` float NOT NULL\r\n" + 
			") ENGINE=InnoDB DEFAULT CHARSET=latin1";
	
	private final static String QUERY_createScontrino =
			"CREATE TABLE IF NOT EXISTS `scontrino` (\r\n" + 
			"  `id` int(11) NOT NULL,\r\n" + 
			"  `totale` float NOT NULL,\r\n" + 
			"  `data_ora` datetime NOT NULL,\r\n" + 
			"  `iva` int(11) NOT NULL,\r\n" + 
			"  `negozio` int(12) NOT NULL\r\n" + 
			") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
	
	private final static String QUERY_deleteProdotti = "DELETE FROM prodotto WHERE true";
	private final static String QUERY_deleteProdScontrini = "DELETE FROM prodotto_scontrino WHERE true"; 
	private final static String QUERY_deleteScontrini = "DELETE FROM scontrino WHERE true";
	private final static String QUERY_deleteNegozi = "DELETE FROM negozio WHERE true"; 

	private final static String QUERY_insertProdotti = 
			"INSERT INTO `prodotto` (`codice`, `nome`, `prezzo`) VALUES\r\n" + 
			"(1, 'PC Notebook Asus', 500),\r\n" + 
			"(2, 'PC Lenovo', 660),\r\n" + 
			"(3, 'PC Vaio 2010', 700)";
	
	private final static String QUERY_insertNegozio = 
			"INSERT INTO `negozio` (`id_negozio`, `responsabile`, `citta`) VALUES\r\n" + 
			"(123, 'NomeCognome', 'Pisa')"; 
	
	private final static String QUERY_insertScontrino = 
			"INSERT INTO `scontrino` (`id`, `totale`, `data_ora`, `iva`, `negozio`) VALUES\r\n" + 
			"(4, 800, '2019-09-10 00:00:00', 10, 0),\r\n" + 
			"(5, 1200, '2019-09-01 00:00:00', 10, 0)";
			
	private static final String QUERY_insertProdScontr = 
			"INSERT INTO prodotto_scontrino (id_prodotto, id_scontrino, quantita, prezzo_applicato) VALUES"
			+ "(1, 4, 2, 1000),"
			+ "(2, 4, 1, 660),"
			+ "(3, 4, 1, 700),"
			+ "(1, 5, 1, 500),"
			+ "(3, 5, 1, 700)";
	
	private final static String[] QUERY = {
			QUERY_createNegozio,
			QUERY_createProdotto,
			QUERY_createProdotto_Scontrino,
			QUERY_createScontrino,
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
