package PPE_EolePackage;

public class TempsCompense {
	static int tempsRéel;
	
	public void TempsCompenses(int tempsRéel) {
		TempsCompense.tempsRéel = tempsRéel;
	
	}
	
	public static int getTempsRéel() {
		tempsRéel = (Chronometre.getHeure() * 3600) + (Chronometre.getMinute() * 60) + (Chronometre.getSeconde());
		return tempsRéel;
	}

	public static void setTempsRéel(int tempsRéel) {
		TempsCompense.tempsRéel = tempsRéel;
	}


	public static int handicap() {
		double hdp = ((5143/(Math.sqrt(FenAjout.lesVoiliers.get(0).getRating()) + 3.5)) * Regate.getDistReg());
		return (int) hdp;
	}
	
	public static int tempsCompenses() {
		int tmpCompens = 51422 + handicap();
		return tmpCompens;
	}
	
	public static void main(String[] args) {
		
		Regate rg = new Regate("La course","strasbourg", 400.0);
		Voilier voilier1 = new Voilier("Black pearl1","Fabert",1,3100, 515);
		Voilier voilier2 = new Voilier("Black pearl2","Fabert",2,3420, 700);
		Voilier voilier3 = new Voilier("Black pearl2","Fabert",2,3420, 700);
		
		FenAjout.lesVoiliers.add(voilier1);
		FenAjout.lesVoiliers.add(voilier2);
		FenAjout.lesVoiliers.add(voilier3);
		
		System.out.println(FenAjout.lesVoiliers.get(0));
		System.out.println(FenAjout.lesVoiliers.get(1).getNomVoilier());
		System.out.println(FenAjout.lesVoiliers.get(0).getRating());
		
		FenAjout.lesVoiliers.get(0).getRating();
		
		
		System.out.println("Il y'a " + (FenAjout.lesVoiliers.size()) + " voiliers inscrit à la course");
		System.out.println(rg.toString());
		System.out.println("l'handicape est égale à : " + handicap());
		System.out.println("le temps compensés est égale à : " + tempsCompenses());
	}
}
