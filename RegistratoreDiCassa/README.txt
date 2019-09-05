# Registratore di cassa

Si vuole implementare una programma per un registratore di cassa. Deve quindi essere possibile effettuare le classiche operazioni.

Elenco requisiti:
* effettuare la registrazione degli importi per i singoli prodotti
* effettuare la stampa dello scontrino come file di testo su disco
* poter applicare sconti al totale
* tenere in considerazione l’iva sulla spesa
* registrare le operazioni in un database
* opzionale: disegnare l’interfaccia per essere fruibile da schermi touch
* Tutti i prodotti sono tassati con la stessa aliquota iva
* Il prezzo di ogni prodotto può essere modificato durante la registrazione

Elenco specifiche:
* Deve essere sempre ben visibile il l’ammontare attuale dello scontrino
* E’ possibile selezionare un prodotto dal menù a tendina
* Una volta selezionato un prodotto non deve essere possibile modificarne il prezzo, ma può essere solo aggiunto allo scontrino tramite l’apposito pulsante
* L’applicazione di uno sconto deve avvenire selezionando l’opportuna voce nel menù a tendina dei prodotti
* Nella selezione del prodotto anonimo, la pulsantiera numerica ritorna abilitata per l’inserimento del prezzo
* Verrà adottato un database basato su MariaDB per la memorizzazione degli scontrini e dei prodotti
* Il valore di aliquota iva sarà memorizzato come costante all’interno dell’applicazione

