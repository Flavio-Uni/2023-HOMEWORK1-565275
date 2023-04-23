package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {
	private String direzioneBloccata;
	private String attrezzoSbloccante;
	public StanzaBloccata(String nome, String attrezzoSbloccante) {
		super(nome);
		this.attrezzoSbloccante = attrezzoSbloccante;
		this.direzioneBloccata = nome;
	}
	
	@Override 	
	public Stanza getStanzaAdiacente(String dir) {
		if(!this.hasAttrezzo(attrezzoSbloccante)) return this;
		Stanza StanzaCorrente = this.getStanzaAdiacente(dir);
		return StanzaCorrente;
	}
	
	@Override 
	public String getDescrizione() {
		String bloccata = "La strada è bloccata verso:" + direzioneBloccata;
		if(!this.hasAttrezzo(attrezzoSbloccante)) return bloccata;
		
		String non_bloccata = "La strada verso " + direzioneBloccata + "è stata sbloccata grazie all'utilizzo di:" + attrezzoSbloccante;
		return non_bloccata;
	}

}
