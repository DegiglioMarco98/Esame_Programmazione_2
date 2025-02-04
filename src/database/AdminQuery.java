package database;
import java.sql.SQLException;
import java.text.ParseException;


//NOTA BENE: INTERFACCIA ADMIN_QUERY NON SO SE LA METTERO
/**
 * Interfaccia amministratore.<br>
 * Contiene tutte le funzionalit� che un admin pu� eseguire sul database.
 * @author matteo
 * @version 1.1
 */
public interface AdminQuery {
	
	/**
	 * Aggiunge un dado al catalogo del database.<br>
	 * Il metodo controlla prima che lo username ricevuto in input corrisponda
	 * effettivamente ad un utente amministratore. Successivamente carica i dati dell'utente 
	 * sul database, a meno che i dadi non siano validi.
	 * 
	 * @param username Username utente da controllare.
	 * 
	 * @param utente da aggiungere.
	 * @throws SQLException
	 * @throws UtenteException Possibili eccezioni:<br>
	 * 		USERNAME_NOT_FOUND, USERNAME_NOT_ADMIN, SERNAME_ALREADY_EXISTS.
	 * @see it.uniba.di.prog2.cs2021.gruppo31.dado.Dado
	 * @see it.uniba.di.prog2.cs2021.gruppo31.utente.Utente
	 * @see it.uniba.di.prog2.cs2021.gruppo31.dado.Filettatura
	 * @see ConnectorDB
	 */
	//public void addUsername(String username, Dado dado) throws SQLException,AziendaException;
	
	/**
	 * Elimina un dado dal catalogo del database.<br>
	 * Il metodo controlla prima che lo username ricevuto in input corrisponda
	 * effettivamente ad un utente amministratore. Successivamente elimina il dado
	 * dal database, a meno che il dado non esista nel database.
	 * @param username Username utente da controllare. 
	 * @param hashDado Dado da eliminare dal catalogo.
	 * @throws SQLException
	 * @throws ParseException
	 * @throws AziendaException Possibili eccezioni:<br>
	 * 		USERNAME_NOT_FOUND, USERNAME_NOT_ADMIN, DADO_NOT_FOUND.
	 * @see it.uniba.di.prog2.cs2021.gruppo31.dado.Dado
	 * @see it.uniba.di.prog2.cs2021.gruppo31.utente.Utente
	 * @see ConnectorDB
	 */
	//public void deleteDado(String username, int hashDado) throws SQLException,AziendaException,ParseException;
	
	/**
	 * Aggiorna il numero di pezzi di un dado nel catalogo.<br>
	 * Il metodo controlla prima che lo username ricevuto in input corrisponda
	 * effettivamente ad un utente amministratore. Successivamente aggiorna il numero
	 * di pezzi per il dado ricevuto in input, a meno che il dado non esista nel database.
	 * @param username Username utente da controllare.
	 * @param hashDado Codice hash del dado da aggiornare.
	 * @param numPezzi Nuovo numero di pezzi del dado.
	 * @throws SQLException
	 * @throws AziendaException Possibili eccezioni:<br>
	 * 		USERNAME_NOT_FOUND, USERNAME_NOT_ADMIN, DADO_NOT_FOUND.
	 * @see it.uniba.di.prog2.cs2021.gruppo31.dado.Dado
	 * @see it.uniba.di.prog2.cs2021.gruppo31.utente.Utente
	 * @see ConnectorDB
	 */
	//public void updatePezziDado(String username, int hashDado, int numPezzi) throws SQLException,AziendaException;
	
	/**
	 * Aggiorna il prezzo di un dado nel catalogo.<br>
	 * Il metodo controlla prima che lo username ricevuto in input corrisponda
	 * effettivamente ad un utente amministratore. Successivamente aggiorna il prezzo
	 * per il dado ricevuto in input, a meno che il dado non esista nel database.
	 * @param username Username utente da controllare.
	 * @param hashDado Codice hash del dado da aggiornare.
	 * @param prezzo Nuovo prezzo del dado.
	 * @throws SQLException
	 * @throws AziendaException Possibili eccezioni:<br>
	 * 		USERNAME_NOT_FOUND, USERNAME_NOT_ADMIN, DADO_NOT_FOUND.
	 * @see it.uniba.di.prog2.cs2021.gruppo31.dado.Dado
	 * @see it.uniba.di.prog2.cs2021.gruppo31.utente.Utente
	 * @see ConnectorDB
	 */
	//public void updatePrezzoDado(String username, int hashDado, double prezzo) throws SQLException,AziendaException;
}

