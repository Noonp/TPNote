package gest;

import java.util.ArrayList;


public class Groupe {
	private int id;
	private String nom;
	private Sujet sujet;
	private ArrayList<Etudiant> etudiants;
	
	private ArrayList<Sujet> voeux;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}
	public ArrayList<Sujet> getVoeux() {
		return voeux;
	}
	public void ajoutVoeux(Integer pos, Sujet suj) {
		if(voeux.isEmpty() || voeux.size()<5) {
			this.voeux.add(pos-1, suj);
		}
		else {
			System.out.println("Max de voeux atteint");
		}
	}
	
	public void ajoutEtudiant(Etudiant pers) {
		if(etudiants.isEmpty() || etudiants.size()<5) {
			this.etudiants.add(pers);
		}
		else {
			System.out.println("Max d'�tudiant atteint");
		}
	}
	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}
	
	public Sujet getSujet() {
		return sujet;
	}
	public Groupe(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.etudiants = new ArrayList<Etudiant>();
		this.voeux = new ArrayList<Sujet>();
		}
	
	public String toString() {
		return "Groupe [id=" + id + ", nom=" + nom + ", etudiants=" + etudiants + ", voeux=" + voeux + "]";
	}
	
	
	
}
