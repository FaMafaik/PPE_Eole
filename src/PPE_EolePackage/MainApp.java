package PPE_EolePackage;

import java.awt.EventQueue;

public class MainApp {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenAjout fenAjout1 = new FenAjout();
					fenAjout1.frameAjout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

}


}
