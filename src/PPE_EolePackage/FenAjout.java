package PPE_EolePackage;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;


public class FenAjout {
	private JFrame frameAjout;   //On crée la fenêtre du nom de frame
    private static JTextField tfNomRegate;  //Champ de saisie
	private static JTextField tfLocalisation;
	private static JTextField tfDistance;
	
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
	
	private JTextField tfNomVoil;
	private JTextField tfRating;
	private JTextField tfSkipper;
	

	
	static List<Voilier> lesVoiliers = new ArrayList<>();
	Voilier voilier1 = new Voilier();
	
	JButton btnAjout;          //Bouton Ajout
	JRadioButton btnClasse1; //Bouton de selection !!!!!!!!!!!!!!
	JRadioButton btnClasse2;
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
		
		ButtonGroup GrpBtn = new ButtonGroup();
		btnClasse1 = new JRadioButton("1");
		btnClasse1.setBackground(Color.CYAN);
		btnClasse1.setBounds(650, 309, 47, 29);
		panel.add(btnClasse1);
		
		btnClasse2 = new JRadioButton("2");  // On cree un groupe de bouttons
		btnClasse2.setBackground(Color.CYAN);
		btnClasse2.setBounds(704, 309, 47, 29);
		panel.add(btnClasse2);
		
		GrpBtn.add(btnClasse1); // On ajoute les boutons au groupe pour en selectionné que un
		GrpBtn.add(btnClasse2);
		
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
		
		JButton btnCommencer = new JButton("COMMENCER LA COURSE");
		btnCommencer.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnCommencer.setBounds(270, 572, 437, 76);
		panel.add(btnCommencer);
		
		btnSupprimer = new JButton("X");
		
		btnSupprimer.setBounds(1017, 10, 70, 70);
		panel.add(btnSupprimer);
		
		
		int valClasse1 = Integer.parseInt(btnClasse1.getText());
		int valClasse2 = Integer.parseInt(btnClasse2.getText());
		
		
		
		btnAjout.addActionListener(new ActionListener() {
			

			
			public void actionPerformed(ActionEvent e) {
				Voilier voilier1 = new Voilier();
				
				JLabel lblNumVoilier = new JLabel(voilier1.getNbVoilier() + 1 + "er Voilier");
				
				if(voilier1.getNbVoilier()== 0) {
					lblNumVoilier.setText("1er Voilier");
				} else if(voilier1.getNbVoilier() > 0){
					lblNumVoilier.setText(voilier1.getNbVoilier() + "ème Voilier");
				}
				
				lblNumVoilier.setText("ze");
				
				voilier1.setNbVoilier(dlm.getSize()+1);
				System.out.println(voilier1.getNbVoilier());
				
				
				
				//méthode qui ajoute un voilier
				voilier1.setNomVoilier(tfNomVoil.getText());
				
				
				System.out.println(voilier1.getNomVoilier().toString());
				
				
				if(btnClasse1.isSelected() ) {
					System.out.println(valClasse1);
					voilier1.setClasseVoilier(valClasse1);
				}
				else if(btnClasse2.isSelected()) {
					System.out.println(valClasse2);
					voilier1.setClasseVoilier(valClasse2);
				}

				
				
							  // generer une exception
						
						
				int valRating = Integer.parseInt(tfRating.getText());
				voilier1.setRating(valRating);
				System.out.println(voilier1.getRating());
				
				voilier1.setNomSkipper(tfSkipper.getText());
				System.out.println(voilier1.getNomSkipper());
				System.out.println();
				//Outils.tabVoilier = new Voilier[20];
				dlm.addElement(voilier1.getNomVoilier()); // ON AJOUTE LE NOM DU VOILIER DANS LA JLIST
				
				lesVoiliers.add(voilier1);
				System.out.println(voilier1.toString());
				System.out.println();
			
				for(Voilier voilier : lesVoiliers) {
					System.out.println(voilier.toString());
				}
				
				
				if(lesVoiliers.size() > 19) {
					System.out.println("Vous ne pouvez plus ajouter de voiliers");
					btnAjout.setVisible(false);
				} else {
					btnAjout.setVisible(true);
				}
			}
			
		});
		
		btnSupprimer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(Voilier voilier1 : lesVoiliers) {
					System.out.println(voilier1.toString());
				}
			}
			
		});
		
		//JButton btnArrive = new JButton("XXX");

	
		
		btnCommencer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Chrono chrono = new Chrono();
				ActionListener actionChrono = new ActionListener() {
					public void actionPerformed(ActionEvent e1)
						{
							Chrono.setSeconde(Chrono.getSeconde() + 1);
							if(Chrono.getSeconde()==60)
							{
								Chrono.setSeconde(0);
								Chrono.setMinute(Chrono.getMinute() + 1);
							}
							if(Chrono.getMinute()==60)
							{
								Chrono.setMinute(0);
								Chrono.setHeure(Chrono.getHeure() + 1);
							}
							chrono.getLblChrono().setText(Chrono.getHeure()+":"+Chrono.getMinute()+":"+Chrono.getSeconde());
						}
					};
				int delais = 1000;
				final Timer timer1 = new Timer(delais, actionChrono);
				
								

				if(lesVoiliers.size() + 1 <= 2) {
					System.out.println("Faut rentrer au moins 2 voiliers");
				}
				else {
					timer1.start();
					chrono.frameChrono.setVisible(true);
					
				}
				
				
			
			}
			
		});
		
	}
	
		
	
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
		
		
		//Outils.tabVoilier = new Voilier[20];

		//System.out.println(lesVoiliers.get(0));
	}
}