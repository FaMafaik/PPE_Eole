package PPE_EolePackage;


public class Regate {
	private static String nomRegate;
	private static String locaReg;
    private static double distReg;
	
    public Regate() {
    	Regate.nomRegate = null;
    	Regate.locaReg = null;
    	Regate.distReg = 0;
    }
    
    public Regate(String nomRegate, String locaReg, double distReg) {
		Regate.nomRegate = nomRegate;
		Regate.locaReg = locaReg;
		Regate.distReg = distReg;
	}
    
    public static String getNomRegate() {
		return nomRegate;
	}

	public void setNomRegate(String nomRegate) {
		Regate.nomRegate = nomRegate;
	}

	public static String getLocaReg() {
		return locaReg;
	}

	public void setLocaReg(String locaReg) {
		Regate.locaReg = locaReg;
	}

	public static double getDistReg() {
		return distReg;
	}

	public void setDistReg(double distReg) {
		Regate.distReg = distReg;
	}
	
	public String toString() {
		return "Le nom de la régate: " + nomRegate + ". " + "Situé à/en/aux :" + locaReg + ". " + "Qui a une distance de " + distReg + " miles." ; 
	}
	
}
