package PPE_EolePackage;

import javax.swing.JTextArea;



public class ExceptionFenAjout {

	//private JPanel contentPane;
	//private final JList listExceptions = new JList();
	JTextArea ta;
	boolean b = true;
	
	public void champsRegate() {
		
		try {
			if (FenAjout.getTfNomRegate().getText().length() == 0 &&
				FenAjout.getTfLocalisation().getText().length() == 0 &&
				FenAjout.getTfDistance().getText().length() == 0)
			{
				System.out.println("Il faut rekoomplir");
			} else {
				System.out.println("cebon");
			}
		} catch (Exception e) {
			ta.setText(e.toString());
			System.out.println(ta.getText());
		}
		
	}
}
