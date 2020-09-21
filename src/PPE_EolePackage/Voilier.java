package PPE_EolePackage;

import java.util.ArrayList;
import java.util.List;


// Ici sont les informations de chaques voiliers

public class Voilier {

	private String nomVoilier;
	private String nomSkipper;
	private int classeVoilier;
	private int rating;
	public Voilier voilier; //Le voilier qu'on prend de la classe Voilier
	public static List<Voilier> lesVoiliers; // on fait une premiere importation
	
	
	public Voilier() {
		this.nomVoilier = null;
		this.nomSkipper = null;
		this.classeVoilier = 0;
		this.rating = 0;
		lesVoiliers = new ArrayList<>();
	}
	
	public Voilier(String nomVoilier, String nomSkipper, int classeVoilier, int rating, int nbVoilier) {
		// TODO Auto-generated constructor stub
		this.nomVoilier = nomVoilier;
		this.nomSkipper = nomSkipper;
		this.classeVoilier = classeVoilier;
		this.rating = rating;
	}



	////////////////////////////////////////////////   METHODE POUR AJOUTER UN VOILIER DANS L ARRAY LIST lesVoiliers
	public void AjouteVoilier(Voilier voilier) {
		lesVoiliers.add(voilier);
	}
	////////////////////////////////////////////////////////////////////////
	
	public Voilier mesVoiliers() {
		return lesVoiliers.get(0);
	}
	
	
	public static int getNbVoilier() {
	
		
		return FenAjout.lesVoiliers.size();
	}

	public static void setNbVoilier(int nbVoilier) {
	}
	public String getNomVoilier() {
		return nomVoilier;
	}

	public void setNomVoilier(String nomVoilier) {
		this.nomVoilier = nomVoilier;
	}

	public String getNomSkipper() {
		return nomSkipper;
	}

	public void setNomSkipper(String nomSkipper) {
		this.nomSkipper = nomSkipper;
	}

	public int getClasseVoilier() {
		return classeVoilier;
	}

	public void setClasseVoilier(int classeVoilier) {
		this.classeVoilier = classeVoilier;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
	public String toString() {
		return " Voilier : " + nomVoilier + " / " + "Nom skipper : " + nomSkipper + " , classe : " + classeVoilier + " rating : " + rating;
	}
	
	
}
