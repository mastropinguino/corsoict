-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Set 16, 2019 alle 10:38
-- Versione del server: 10.3.15-MariaDB
-- Versione PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `registratore_di_cassa`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `negozio`
--

CREATE TABLE IF NOT EXISTS `negozio` (
  `id_negozio` int(11) NOT NULL,
  `responsabile` char(12) DEFAULT NULL,
  `citta` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `negozio`
--

INSERT INTO `negozio` (`id_negozio`, `responsabile`, `citta`) VALUES
(123, 'NomeCognome', 'Pisa'),
(456, 'NomeCognome2', 'Lucca');

-- --------------------------------------------------------

--
-- Struttura della tabella `prodotto`
--

CREATE TABLE IF NOT EXISTS `prodotto` (
  `codice` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL,
  `prezzo` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `prodotto`
--

INSERT INTO `prodotto` (`codice`, `nome`, `prezzo`) VALUES
(1, 'PC Notebook Asus', 500),
(2, 'PC Lenovo', 660),
(3, 'PC Vaio 2010', 700);

-- --------------------------------------------------------

--
-- Struttura della tabella `prodotto_scontrino`
--

CREATE TABLE `prodotto_scontrino` (
  `id_prodotto` int(11) NOT NULL,
  `id_scontrino` int(11) NOT NULL,
  `quantita` int(11) NOT NULL,
  `prezzo_applicato` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `scontrino`
--

CREATE TABLE `scontrino` (
  `id` int(11) NOT NULL,
  `totale` float NOT NULL,
  `data_ora` datetime NOT NULL,
  `iva` int(11) NOT NULL,
  `negozio` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `scontrino`
--

INSERT INTO `scontrino` (`id`, `totale`, `data_ora`, `iva`, `negozio`) VALUES
(4, 800, '2019-09-10 00:00:00', 10, 0),
(5, 1200, '2019-09-01 00:00:00', 10, 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
