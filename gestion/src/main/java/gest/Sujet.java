package gest;


public class Sujet {
	private int id;
	private String titre;
	private String description;
	private Encadrant encadre;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}


	public Encadrant getEncadre() {
		return encadre;
	}

	public void setEncadre(Encadrant encadre) {
		this.encadre = encadre;
	}

	public Sujet(int id, String titre, String description, Encadrant encadre) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.encadre = encadre;
	}

	
	public String toString() {
		return "Sujet [id=" + id + ", titre=" + titre + ", description=" + description + ", encadre="
				+ encadre + "]";
	}
	
	
	
	
}
