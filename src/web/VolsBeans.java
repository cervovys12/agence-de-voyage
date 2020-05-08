package web;

import java.util.ArrayList;

import voyage.Vol;

public class VolsBeans {
	private Vol vol =new Vol();
	private ArrayList<Vol> liste = new ArrayList<Vol>();
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public ArrayList<Vol> getListe() {
		return liste;
	}
	public void setListe(ArrayList<Vol> liste) {
		this.liste = liste;
	}
	
}
