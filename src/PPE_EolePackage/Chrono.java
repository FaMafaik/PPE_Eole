package PPE_EolePackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;



public class Chrono extends FenAjout {
	 
	JFrame frameChrono;
	private JPanel panelChrono;
	private JButton btnFinCourse;
	
	
	private JLabel lblTitreCourse;
	private JLabel lblArrive;
	private JLabel lblAbandon;
	
	//LES VARIABLES POUR LE CHRONO
	private JLabel lblChrono;
	
	private static int heure=0,minute=0,seconde=0;	
	public static int getHeure() {
		return heure;
	}


	public static void setHeure(int heure) {
		Chrono.heure = heure;
	}


	public static int getMinute() {
		return minute;
	}


	public static void setMinute(int minute) {
		Chrono.minute = minute;
	}


	public static int getSeconde() {
		return seconde;
	}


	public static void setSeconde(int seconde) {
		Chrono.seconde = seconde;
	}

	int delais = 1000;
	private ActionListener actionChrono;
	




	
	public Chrono() {
		initialise();
	}
	
	// LES LIST
	DefaultListModel<String> dlm;
	DefaultListModel<String> dlm2;
	JList<String> listVoiliersArrive;
	JList<String> listVoiliersAbandon;
	//private JButton btnArrive;
	
	
	//LesBoutons de courses
	
	JButton[][] btnVoiliers = new JButton[5][2];
	
	
	public void startChrono() {
		actionChrono = new ActionListener() {
			public void actionPerformed(ActionEvent e1)
				{
					seconde++;
					if(seconde==60)
					{
						seconde=0;
						minute++;
					}
					if(minute==60)
					{
						minute=0;
						heure++;
					}
					getLblChrono().setText(heure+":"+minute+":"+seconde);
				}
			};
		int delais = 1000;
		Timer timer1 = new Timer(delais, actionChrono);
		timer1.start();
	}
	
	
	private void initialise() {
		

	

		
		frameChrono = new JFrame("Suivi de la course");
		frameChrono.setBounds(100,100,1200,720);
		frameChrono.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelChrono = new JPanel();
		panelChrono.setBackground(Color.CYAN);
		panelChrono.setForeground(Color.CYAN);
		frameChrono.getContentPane().add(panelChrono, BorderLayout.CENTER);
		panelChrono.setLayout(null);
		
		
		btnFinCourse = new JButton("FIN COURSE");
		btnFinCourse.setFont(new Font("Tahoma", Font.PLAIN,30));
		btnFinCourse.setBounds(270, 572, 437, 76);
		panelChrono.add(btnFinCourse);
		
		lblTitreCourse = new JLabel("(NOM) (DISTANCE) MILES à (LOCALISATION)");
		lblTitreCourse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitreCourse.setBounds(100,1,1000,100);
		panelChrono.add(lblTitreCourse);
		
		setLblChrono(new JLabel(heure+":"+minute+":"+seconde));
		getLblChrono().setFont(new Font("Tahoma", Font.PLAIN, 40));
		getLblChrono().setBounds(450, 70, 231, 70);
		panelChrono.add(getLblChrono());
		
		lblArrive = new JLabel("Les arrivants");
		lblArrive.setFont(new Font("Tahoma",Font.PLAIN,15));;
		lblArrive.setBounds(1030,10,205,50);
		panelChrono.add(lblArrive);
		
		lblAbandon = new JLabel("Les abandons");
		lblAbandon.setFont(new Font("Tahoma",Font.PLAIN,15));
		lblAbandon.setBounds(1030,340,205,50);
		panelChrono.add(lblAbandon);
		
		
		//1er jlist des arrivés
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
		
		for(int i = 0; i<5; i++) {
			for(int j =0 ; j<2; j++) {
				btnVoiliers[i][j] = new JButton();
			    btnVoiliers[i][j].setFont(new Font("Tahoma", Font.PLAIN,30));
			    btnVoiliers[i][j].setVisible(true);
				panelBtnArrives.add(btnVoiliers[i][j]);
			}
		}
		
	
		
		
		//On creer les boutons
		
	/*	for(Voilier voilier : lesVoiliers) {
			System.out.println(lesVoiliers.toString());
			
		    btnArrive = new JButton(voilier.getNomVoilier());
		    btnArrive.setFont(new Font("Tahoma", Font.PLAIN,30));
		    btnArrive.setVisible(true);
			panelBtnArrives.add(btnArrive);

		} */
		
		
		
		btnFinCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println(lesVoiliers.toString());
					
			}
		});
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chrono fenChrono = new Chrono();
					fenChrono.frameChrono.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public JLabel getLblChrono() {
		return lblChrono;
	}


	public void setLblChrono(JLabel lblChrono) {
		this.lblChrono = lblChrono;
	}
		
		
}