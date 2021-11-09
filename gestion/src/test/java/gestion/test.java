package gestion;
import gest.*;
public class test {

	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant("Bentolila","Jérémie");
		Etudiant etu2 = new Etudiant("Lansalot","Clara");
		Etudiant etu3 = new Etudiant("Zeggar","Rym");
		Etudiant etu4 = new Etudiant("Ettahiri","Sofian");
		Encadrant Daud = new Encadrant("Daude","Sylvain");
		Sujet suj1 = new Sujet(1,"Abeilles","Petites Abeilles",Daud);
		Sujet suj2 = new Sujet(2,"Abel","Grandes Abeilles",Daud);
		
		Groupe grp1 = new Groupe(1,"GirlPower");
		Groupe grp2 = new Groupe(2,"Bromance");
		grp1.ajoutEtudiant(etu2);
		grp1.ajoutEtudiant(etu3);
		grp2.ajoutEtudiant(etu1);
		grp2.ajoutEtudiant(etu4);
		grp1.ajoutVoeux(1, suj1);
		grp1.ajoutVoeux(1, suj2);
		
		System.out.println(grp1.toString());
		System.out.println(suj1.toString());
		System.out.println(etu1.toString());
		System.out.println(Daud.toString());
		
	}

}
