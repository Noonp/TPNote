package gest;


public class Enseignant {
	private String nom;
	private String prenom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Enseignant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
