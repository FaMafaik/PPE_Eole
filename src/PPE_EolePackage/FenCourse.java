package PPE_EolePackage;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;



public class FenCourse extends FenAjout {

	//LES BOUTONS
	private static JButton btnFinCourse;

	//PANEL
	private JPanel panelChrono;
	public JFrame frameCourse;
	//LES LABELS
	private JLabel lblTitreCourse;  // TITRE DE LA FENETRE SUR LE PANEL
	private JLabel lblArrive;		// LIBELLE "ARRIVE" AU DESSUS DE LA JList DES ARRIVANTS
	private JLabel lblAbandon;      // LIBELLE "ABANDON" AU DESSUS DE LA JList DES ABANDONS
	static JLabel lblChrono;       // LIBELLE QUI AFFICHE LE CHRONO HH:MM:SS
	///////////////////////////////////
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public JLabel getLblTitreCourse() {
		return lblTitreCourse;
	}

	public void setLblTitreCourse(JLabel lblTitreCourse) {
		this.lblTitreCourse = lblTitreCourse;
	}

	public JLabel getLblArrive() {
		return lblArrive;
	}

	public void setLblArrive(JLabel lblArrive) {
		this.lblArrive = lblArrive;
	}

	public JLabel getLblAbandon() {
		return lblAbandon;
	}

	public void setLblAbandon(JLabel lblAbandon) {
		this.lblAbandon = lblAbandon;
	}

	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// LES LIST
		DefaultListModel<String> dlm;       ////////////////
		DefaultListModel<String> dlm2;
		JList<String> listVoiliersArrive;
		JList<String> listVoiliersAbandon;
		//private JButton btnArrive;
		
		
		//LesBoutons de courses
		////////////////////////////////////////////////// A MODIFIER ET COMPLETER LES BOUTONS DE COURSES DOIVENT ETRE CREE DE PAIRE / DEUX BOUTONS PAR VOILIERS
		//////////////////////////////////////////////////// UN QUI SERVIRA A DECLARER UN VOILIER COMME ARRIVEE ET UN AUTRE COMME ABANDON
		///////////////////////////////////////////////////////////LORSQUE L UN DES DEUX EST ACTIVE  LES DEUX BOUTON DISSPARAISS
		///////////////////////////////////////////////////////// ON PEUT AFFICHER ALORS UN LABEL A LA PLACE AVEC LE NOM DU VOILIER ET SON ETAT ABANDON OU ARRIVE
		JButton[][] btnVoiliers = new JButton[5][2];
		
		
	public FenCourse() {
		initialize();  // INITIALISE LA FENETRE
	}
	
	private void initialize() {
		frameCourse = new JFrame("Suivi de la course");
		frameCourse.setBounds(100,100,1200,720);
		frameCourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelChrono = new JPanel();
		panelChrono.setBackground(Color.CYAN);
		panelChrono.setForeground(Color.CYAN);
		frameCourse.getContentPane().add(panelChrono, BorderLayout.CENTER);
		panelChrono.setLayout(null);
		
		
		btnFinCourse = new JButton("FIN COURSE");
		btnFinCourse.setFont(new Font("Tahoma", Font.PLAIN,30));
		btnFinCourse.setBounds(270, 572, 437, 76);
		panelChrono.add(btnFinCourse);
		
		lblTitreCourse = new JLabel("Nom de la Régate : " + Regate.getNomRegate() + " / Distance : " + Regate.getDistReg() + " miles"  + " / Lieu : " + Regate.getLocaReg());
		lblTitreCourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitreCourse.setBounds(100,1,1000,100);
		panelChrono.add(lblTitreCourse);
	
		
		lblChrono = (new JLabel(Chronometre.getHeure()+":"+Chronometre.getMinute()+":"+Chronometre.getSeconde()));
		lblChrono.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblChrono.setBounds(450, 70, 231, 70);
		panelChrono.add(lblChrono);
		
		lblArrive = new JLabel("Les arrivants");
		lblArrive.setFont(new Font("Tahoma",Font.PLAIN,15));;
		lblArrive.setBounds(1030,10,205,50);
		panelChrono.add(lblArrive);
		
		lblAbandon = new JLabel("Les abandons");
		lblAbandon.setFont(new Font("Tahoma",Font.PLAIN,15));
		lblAbandon.setBounds(1030,340,205,50);
		panelChrono.add(lblAbandon);
		
		dlm = new DefaultListModel<String>();
		listVoiliersArrive = new JList<String>(dlm);
		listVoiliersArrive.setBounds(970, 50, 205,280);
		panelChrono.add(listVoiliersArrive);
		
		dlm2 = new DefaultListModel<String>();
		listVoiliersAbandon = new JList<String>(dlm2);
		listVoiliersAbandon.setBounds(970, 380, 205,280);
		panelChrono.add(listVoiliersAbandon);
		
		JPanel panelBtnArrives = new JPanel();
		panelBtnArrives.setBackground(Color.WHITE);
		panelBtnArrives.setOpaque(true);
		panelBtnArrives.setBounds(100, 150, 800, 400);
		
		panelChrono.add(panelBtnArrives);
		
		GridLayout btnArriveLayout = new GridLayout(2,5);
		panelBtnArrives.setLayout(btnArriveLayout);
		

		/////////////////////////////////////////////////////////////////////////////////////
		for(int i = 0; i<5; i++) {
			for(int j =0 ; j<2; j++) {
				btnVoiliers[i][j] = new JButton();
			    btnVoiliers[i][j].setFont(new Font("Tahoma", Font.PLAIN,30));        /// ON AJOUT LES BOUTONS
			    btnVoiliers[i][j].setVisible(true);
				panelBtnArrives.add(btnVoiliers[i][j]);
			}
		}
		

		
		///   LORSQU'ON APPUIE SUR LE BOUTON DE FIN DE COURSE
		//////////////////////////////////////////////////////////////////////////
		btnFinCourse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Chronometre.stopTomer();
				System.out.println("Le temps arreté et affiche en secondes est égale à : " + TempsCompense.getTempsRéel() + " secnondes");
			}
			
		});
		
	}
	
		
		
		//Outils.tabVoilier = new Voilier[20];

		//System.out.println(lesVoiliers.get(0));
}


