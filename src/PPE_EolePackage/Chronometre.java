package PPE_EolePackage;


	import java.awt.event.*;

import javax.swing.Timer;

	public class Chronometre {
		
		
		//LES VARIABLES POUR COMPTER LE CHRONO
		static int heure=0,
				   minute=0,
				   seconde=0;
	
	    
		
		
		// ON CREE UNE VARIABLE DE TYPE ACTION LISTENER QUI DOIT ETRE UTILISER PARTOUT
		static ActionListener timerAction;
		
		
		
	    static Timer timer2020;
	    // Méthode renvoyant un timer prêt à démarrer
		
   
	    //ETAPE 1
	    // ON CREE L ACTION LISTENER DE LA VARIABLE timerAction
	    public static void createTimer ()
	    {
	      // Création d'une instance de listener 
	      // associée au timer
	    	timerAction = new ActionListener()
			{
	    		
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
					
					FenCourse.lblChrono.setText(heure+":"+minute+":"+seconde);
				}
			
				
			};
	      // Création d'un timer qui génère un tic
	      // chaque 500 millième de seconde
			timer2020 = new Timer(1000, timerAction);
			
	    }  
	   ////////////////////////////////////////////////////////////////////
	    
	    //ON CREE DEUX METHODES POUR CONTROLER LE TIMER
	    
	    // METHODE START TIMER
	    
	   public static  void startTimer() {
		   timer2020.start();
	   }
	    
	   public static void stopTomer() {
		   timer2020.stop();
	   }
	    
	    
	    /////////////////////////////////////////////////////////////
		public static int getHeure() {
			return heure;
		}
		public static void setHeure(int heure) {
			Chronometre.heure = heure;
		}

		public static int getMinute() {
			return minute;
		}
		public static void setMinute(int minute) {								// GETERS SETTERS DE HEURE, MINUTE, SECONDE
			Chronometre.minute = minute;
		}
		
		public static int getSeconde() {
			return seconde;
		}
		public static void setSeconde(int seconde) {
			Chronometre.seconde = seconde;
		}
		//////////////////////////////////////////////////////////////////////////
	
}


