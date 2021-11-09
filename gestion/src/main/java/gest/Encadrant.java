package gest;
import java.util.ArrayList;


public class Encadrant extends Enseignant {

	public Encadrant(String nom, String prenom) {
		super(nom, prenom);
	}
	
	//private ArrayList<Sujet> sujets = new ArrayList<Sujet>();

	/*public ArrayList<Sujet> getSujets() {
		return sujets;
	}

	public void addSujets(Sujet suj) {
		this.sujets.add(suj);
	}*/

	public Encadrant(String nom, String prenom, Sujet sujets) {
		super(nom, prenom);
		//this.sujets.add(sujets);
	}

	@Override
	public String toString() {
		return "Encadrant [getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + "]";
		//sujets=" + sujets + ", 
	}
	
	
	
	
}
