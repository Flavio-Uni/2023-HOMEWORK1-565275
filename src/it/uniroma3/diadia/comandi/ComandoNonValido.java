package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {

	private IO io;
	
	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Comando sconosciuto");
	}

	@Override
	public void setParametro(String parametro) {
		//non ha parametri
		
	}

}