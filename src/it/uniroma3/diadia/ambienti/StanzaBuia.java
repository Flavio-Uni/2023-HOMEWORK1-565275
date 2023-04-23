package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {
	private String attrezzoLucente;
	public StanzaBuia(String nome, String attrezzoLucente) {
		super(nome);
		this.attrezzoLucente = attrezzoLucente;
	}
	
	@Override
	public String getDescrizione() {
		String buio = new String();
		buio = "Qui c'è un buio pesto!";
		if(!this.hasAttrezzo(attrezzoLucente)) {
			return buio;
		}
		String no_buio = new String();
		no_buio = "Qui non c'è un buio pesto!";
		return no_buio;
	}
}
