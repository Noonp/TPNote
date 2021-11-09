package gest;


public class Etudiant {
	private String nom;
	private String prenom;
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Etudiant() {}
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
