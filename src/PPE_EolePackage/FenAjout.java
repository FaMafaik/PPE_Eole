package PPE_EolePackage;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;





public class FenAjout  {
	/////////////////////////////////////////////////////////////// UNE VARIABLE STATIC EST UNE VARIABLE DE CLASSE ET NON D INSTANCE
	///////////////////////////////////////////////////////////////////////////  ELLE N EST PAS PROPRE A L OBJET QUON CREE   SERT POUR UTILISER LA VARIABLE DANS LES AUTRES CLASSES
	
	JFrame frameAjout;   //On crée la fenêtre du nom de frame
    private static JTextField tfNomRegate;  //Champ de saisie
	private static JTextField tfLocalisation;
	private static JTextField tfDistance;
	
	private static JTextField tfNomVoil;
	private static JTextField tfRating;
	private static JTextField tfSkipper;
	static ButtonGroup grpBtnClasses;
	


	private static JButton btnCommencer;
	


	public static JTextField getTfNomRegate() {
		return tfNomRegate;
	}

	public static void setTfNomRegate(JTextField tfNomRegate) {
		FenAjout.tfNomRegate = tfNomRegate;
	}

	public static JTextField getTfLocalisation() {
		return tfLocalisation;
	}

	public static void setTfLocalisation(JTextField tfLocalisation) {
		FenAjout.tfLocalisation = tfLocalisation;
	}

	public static JTextField getTfDistance() {
		return tfDistance;
	}

	public static void setTfDistance(JTextField tfDistance) {
		FenAjout.tfDistance = tfDistance;
	}
	
	
	public static JTextField getTfNomVoil() {
		return tfNomVoil;
	}

	public void setTfNomVoil(JTextField tfNomVoil) {
		FenAjout.tfNomVoil = tfNomVoil;
	}

	public static JTextField getTfRating() {
		return tfRating;
	}

	public void setTfRating(JTextField tfRating) {
		FenAjout.tfRating = tfRating;
	}

	public static JTextField getTfSkipper() {
		return tfSkipper;
	}

	public void setTfSkipper(JTextField tfSkipper) {
		FenAjout.tfSkipper = tfSkipper;
	}

	public static ButtonGroup getGrpBtnClasses() {
		return grpBtnClasses;
	}

	public static void setGrpBtnClasses(ButtonGroup grpBtnClasses) {
		FenAjout.grpBtnClasses = grpBtnClasses;
	}
	
	static List<Voilier> lesVoiliers = new ArrayList<>();
	Voilier voilier1 = new Voilier();
	
	JButton btnAjout;          //Bouton Ajout
	
	static JRadioButton btnClasse1; //Bouton de selection !!!!!!!!!!!!!!
	static JRadioButton btnClasse2;
	
	JButton btnSupprimer; //Pour Supprimer un voilier
	DefaultListModel<String> dlm; //Stocker les informations de l'interface
	JList<String> listVoiliers;
	
	// Lance l'application
	//
	
	// Crée l'application
	public FenAjout() {
		initialize();
	}
	
	// Iniyizlidr les contenus de la fenetre
	
	private void initialize() {
		frameAjout = new JFrame(); //On associe nos variables à une nouvelle ...
		frameAjout.setBounds(100, 100, 1280, 720); //taille de la fenetre
		frameAjout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setForeground(Color.CYAN);
		frameAjout.getContentPane().add(panel, BorderLayout.CENTER);/////
		panel.setLayout(null); // supprimer le Layout par défaut d'une classe, il faut appeler la méthode setLayout() 
		
		
		
		JLabel lblNomRegate = new JLabel("NOM DE LA REGATE :"); // ON CREE LES JLABEL
		lblNomRegate.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNomRegate.setBounds(34, 40, 231, 56);
		panel.add(lblNomRegate);
		
		tfNomRegate = new JTextField();  // ON CREE LES CHAMPS DE SAISIES ASSOCIES
		tfNomRegate.setBounds(260, 47, 304, 49);
		panel.add(tfNomRegate);
		tfNomRegate.setColumns(10);
		
		JLabel lblLocalis = new JLabel("LOCALISATION :");
		lblLocalis.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblLocalis.setBounds(34, 99, 176, 56);
		panel.add(lblLocalis);
		
		tfLocalisation = new JTextField();
		tfLocalisation.setColumns(10);
		tfLocalisation.setBounds(217, 106, 304, 49);
		panel.add(tfLocalisation);
		
		JLabel lblDistance = new JLabel("DISTANCE :");
		lblDistance.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblDistance.setBounds(34, 157, 129, 56);
		panel.add(lblDistance);
		
		tfDistance = new JTextField();
		tfDistance.setColumns(10);
		tfDistance.setBounds(163, 164, 129, 49);
		panel.add(tfDistance);
	
		JLabel lblMiles = new JLabel("MILES");
		lblMiles.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMiles.setBounds(332, 157, 88, 56);
		panel.add(lblMiles);
		
		// ICI compteur voilier
		
		JLabel lblNumVoilier = new JLabel();
		lblNumVoilier.setText("1er Voilier");
		lblNumVoilier.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNumVoilier.setBounds(332, 220, 231, 56);
		panel.add(lblNumVoilier);
		
		// REMPLIR ICI ///////////////////////////////////
		
		JLabel lblNomVoilier = new JLabel("NOM");
		lblNomVoilier.setFont(new Font("Tamoha", Font.PLAIN, 23));
		lblNomVoilier.setBounds(547, 227, 304, 49);
		panel.add(lblNomVoilier);
		
		tfNomVoil = new JTextField();
		tfNomVoil.setColumns(10);
		tfNomVoil.setBounds(623, 227, 304, 49);
		panel.add(tfNomVoil);
		
		JLabel lblClasse = new JLabel("CLASSE :");
		lblClasse.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblClasse.setBounds(547, 292, 103, 56);
		panel.add(lblClasse);
		
		
		
		/////////////////////////////////////////////////////////// LES JRADIOBUTTON POUR CHOISIR LA CLASSE DU VOILIER
		grpBtnClasses = new ButtonGroup();
		btnClasse1 = new JRadioButton("1");
		btnClasse1.setBackground(Color.CYAN);
		btnClasse1.setBounds(650, 309, 47, 29);
		panel.add(btnClasse1);
		
		btnClasse2 = new JRadioButton("2");  // On cree un groupe de bouttons
		btnClasse2.setBackground(Color.CYAN);
		btnClasse2.setBounds(704, 309, 47, 29);
		panel.add(btnClasse2);
		
		grpBtnClasses.add(btnClasse1); // On ajoute les boutons au groupe pour en selectionné que un
		grpBtnClasses.add(btnClasse2);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		JLabel lblRating = new JLabel("RATING :");
		lblRating.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblRating.setBounds(547, 358, 103, 56);
		panel.add(lblRating);
		
		tfRating = new JTextField();
		tfRating.setColumns(10);
		tfRating.setBounds(650, 365, 128, 49);
		panel.add(tfRating);
		
		JLabel lblNomDuSkipper = new JLabel("NOM DU SKIPPER :");
		lblNomDuSkipper.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNomDuSkipper.setBounds(547, 433, 205, 56);
		panel.add(lblNomDuSkipper);
		
		
		tfSkipper = new JTextField();
		tfSkipper.setColumns(10);
		tfSkipper.setBounds(752, 440, 176, 49);
		panel.add(tfSkipper);
		
		dlm = new DefaultListModel<String>();  // ON CREE NOTRE JLIST
		listVoiliers = new JList<String>(dlm);
		listVoiliers.setBounds(1053, 0, 205, 675);
		panel.add(listVoiliers);
		
		btnAjout = new JButton("AJOUTER LE VOILIER");
		btnAjout.setBounds(597, 508, 297, 39);
		panel.add(btnAjout);
		
		btnCommencer = new JButton("COMMENCER LA COURSE");
		btnCommencer.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnCommencer.setBounds(270, 572, 437, 76);
		panel.add(btnCommencer);
		
		btnSupprimer = new JButton("X");
		
		btnSupprimer.setBounds(950, 10, 70, 70);
		panel.add(btnSupprimer);
		
		
		int valClasse1 = Integer.parseInt(btnClasse1.getText());
		int valClasse2 = Integer.parseInt(btnClasse2.getText());
		
	    
	 
		
	///////////////////////////////////////////////////////////// QUAND ON CLIQUE SUR LE BOUTON AJOUT DE VOILIER 
		
		btnAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ExceptionFenAjout.champsVoilier();
					
				if(ExceptionFenAjout.etatChampsVoilier == true) {
					Voilier voilier1 = new Voilier();
				
					
					if(lesVoiliers.size() == 0) {
						lblNumVoilier.setText("1er eeVoilier");
					} else if(lesVoiliers.size() > 0){
						lblNumVoilier.setText( "ème Voilier");
					}
					
					lblNumVoilier.setText("ze");
					 
					System.out.println("Il y'a " + ((FenAjout.lesVoiliers.size()) + 1) + " voiliers inscrit à la course");
					
					
					//ON AJOUTE LE NOM DU VOILIER A L INSTANCE DE LOBJET VOILIER ET DANS LARRAY LIST
					voilier1.setNomVoilier(tfNomVoil.getText());
					System.out.println(voilier1.getNomVoilier().toString());
					///
					
					if(btnClasse1.isSelected() ) {
						System.out.println("La classe selectionnée est : " + valClasse1);
						voilier1.setClasseVoilier(valClasse1);
					}
					else if(btnClasse2.isSelected()) {
						System.out.println("La classe selectionnée est : " + valClasse2);
						voilier1.setClasseVoilier(valClasse2);
					}
					
					//////////////////////////////////////////// ON CONVERTI LE RATING SAISIE STRING EN INT POUR LE METTRE DANS LINSTANCE DU VOILIER
					
					if(getTfRating().getText() == null) {
						System.out.println("il faut saisir le rating");
					} else {
						int valRating = Integer.parseInt(tfRating.getText());
						voilier1.setRating(valRating);
						System.out.println("Le rating du voilier sasie est égale à : " + voilier1.getRating());
						///////////////////////////////////////////////////////////////////////////
					}
					
					
		
					voilier1.setNomSkipper(tfSkipper.getText());
					System.out.println("Le nom du skipper saisi est : " + voilier1.getNomSkipper());
					System.out.println();
					
					dlm.addElement(voilier1.getNomVoilier()); // ON AJOUTE LE NOM DU VOILIER DANS LA JLIST
					
					
					
					if(lesVoiliers.size() < 21) {
						btnAjout.setVisible(true);
						// ON AFFICHE A CHAQUE FOIS LE CONTENU DE LA LIST LES VOILIERS POUR VERIFIER SI IL A BIEN ETE INTRODUIT
						lesVoiliers.add(voilier1);  // ON AJOUTE L INSTANCE DE LOBJET VOILIER DANS LARRAY LIST
						System.out.println(voilier1.toString());
						System.out.println();
					} else {
						btnAjout.setVisible(false);
						System.out.println("Vous ne pouvez plus ajouter de voiliers");
					}
					
					for(Voilier voilier : lesVoiliers) {
						System.out.println(voilier.toString());
					}
				} else {
					ExceptionFenAjout.etatChampsVoilier = false;
					System.out.println("Il faut remplir les champs du voilier");
				}	
			}
		});
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
///////////////////////////////////////////////////////////////////////////// QUAND ON CLIQUE SUR LE BOUTON SUPPRIMER   IL DOIT SUPPRIMER LE VOILIER QU ON A CHOISI  DS LA JLIST PAR UN CLIQUE DESSUS
		////////////////////////////////////////////////////////////////////////////// SINON IL SUPPRIME SIMPLEMENT LE DERNIER VOILIER SAISI
		btnSupprimer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(Voilier voilier1 : lesVoiliers) {
					System.out.println(voilier1.toString());
				}
			}
			///////////////////////////////////////////////////////// A MODIFIER ET FINIR
		});
////////////////////////////////////////////////////////////////////
	

		
//////////////////////////////////////////////////////////////////////////////// QUAND ON CLIC SUR LE BOUTON COMMENCER
		btnCommencer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ExceptionFenAjout.champsRegate();
				
					
					
					if(lesVoiliers.size() +1 > 2) {
						if(ExceptionFenAjout.etatChampsRegate = true) {
							Regate regate1 = new Regate();
							regate1.setNomRegate(tfNomRegate.getText());
							regate1.setLocaReg(tfLocalisation.getText());
							
	
							double valDistance = Double.parseDouble(tfDistance.getText());
							regate1.setDistReg(valDistance);
							System.out.println(Regate.getDistReg());
							
							FenCourse fenCourse = new FenCourse();
							fenCourse.frameCourse.setVisible(true);
							Chronometre.createTimer();
							Chronometre.startTimer();
						} else {
							JOptionPane.showMessageDialog(null, "Il faut remplir tout les champs de regate");
		
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "il faut au moins 2 voiliers");
					}
				//	ExceptionFenAjout.etatChampsRegate = false;
					System.out.println(ExceptionFenAjout.etatChampsRegate);
					
				//ExceptionFenAjout.champsRegate();
				
				//if(ExceptionFenAjout.etatChampsRegate = true) {
				//	if(lesVoiliers.size() + 1 > 2) {
				//		FenCourse fenCourse = new FenCourse();
				//		Chronometre.createTimer();
				//		Chronometre.startTimer();
						
			//			fenCourse.frameCourse.setVisible(true);
						
						//System.out.println("Faut rentrer au moins 2 voiliers");
			//		} else {
					//	System.out.println("Il faut au moins 2 voiliers");
			//		}
			//	} else {
			//		System.out.println("il faut remplir les champs");
				
					
				//	System.out.println(fenCourse.getLblChrono().getText());  
					
					
			//		ActionListener tache_timer = new ActionListener();
			//Timer timer1= new Timer(delais, tache_timer);
				//	timer1.start();
					//fenCourse.getLblChrono().setText("ee");
				//	System.out.println(fenCourse.getLblChrono().getText());   //Retourne ce qu'il y'a au chrono
					
			//fenCourse.setLblChronoStr(fenCourse.getLblChrono());
				//}
			}
			
		});
		
	
		}

}