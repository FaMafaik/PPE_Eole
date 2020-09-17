package PPE_EolePackage;


public class Regate {
	private String locaReg;
	private String libReg;
    private static double distReg;
	
	
	
	

	public Regate(String lib,String loca, double distReg) {
		this.locaReg=loca;
		this.libReg = lib;
		Regate.distReg = distReg;
		
	}
	
	public String toString() {
		return "Le nom de la régate: " + libReg + ". " + "Situé à/en/aux :" + locaReg + ". " + "Qui a une distance de " + distReg + " miles." ; 
	}
	public String getLocaReg() {
		return locaReg;
	}
	public void setLocaReg(String locaReg) {
		this.locaReg = locaReg;
	}
	public String getLibReg() {
		return libReg;
	}
	public void setLibReg(String libReg) {
		this.libReg = libReg;
	}
	
	public static double getDistReg() {
		return distReg;
	}

	public void setDistReg(double distReg) {
		Regate.distReg = distReg;
	}
	
}
