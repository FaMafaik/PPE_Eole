package PPE_EolePackage;

import javax.swing.JOptionPane;



public class ExceptionFenAjout {

	//private JPanel contentPane;
	//private final JList listExceptions = new JList();

	
	static boolean etatChampsRegate = false;
	static boolean etatChampsVoilier = false;
	
	
	
	
	
	
	
	public static void champsRegate() {
		
		try {
			if (
				FenAjout.getTfNomRegate().getText().length() == 0 ||
				FenAjout.getTfLocalisation().getText().length() == 0 ||
				FenAjout.getTfDistance().getText().length() == 0)
			{
						JOptionPane.showMessageDialog(null, "Il faut remplir les champs");
						
			} else {
				ExceptionFenAjout.etatChampsRegate = true;
				System.out.println("Etat champs regate : " + etatChampsRegate);
			}
		} catch (Exception e) {
			//
		}
	}
	
	public static void champsVoilier() {
		try {
			//FenAjout.getTfNomVoil().getText().length() == 0 ||
			if (
				FenAjout.getTfNomVoil().getText().length() == 0 ||
				FenAjout.grpBtnClasses.getSelection() == null ||
				FenAjout.getTfRating().getText().length() == 0 ||
				FenAjout.getTfSkipper().getText().length() == 0
				)
			{
				JOptionPane.showMessageDialog(null, "il faut remplir les champs du voilier");
				etatChampsVoilier = false;
			} else {
				System.out.println("Les champs du voilier ont été reemplis");
				etatChampsVoilier = true;
			}
			
		} catch (Exception e) {
			
		}
		
	}
}
