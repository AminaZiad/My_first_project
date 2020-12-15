
import java.awt.*;
import javax.swing.*;

public class Cal {


		public Cal()
		{	JFrame fenetre =new JFrame();
		
		      fenetre.setTitle("calculatrice");
	          fenetre.setSize(240,260);
	          fenetre.setLocationRelativeTo(null); //position de fenetre au milieu
	          fenetre.setResizable(false);// on peut pas le changer la position
	          
	        JPanel contenuFenetre =new JPanel();
	      		BorderLayout disposition1 = new BorderLayout();
	      	 contenuFenetre.setLayout(disposition1);
	      	 
	      	 //ecran
	      	JPanel ecran =new JPanel();
	      	ecran.setPreferredSize(new Dimension(220,180));
	      	
	      	JLabel label =new JLabel("0");
	      	
	      //	Label.setHorizontalAligmment(JLable.RIGHT);
	      	ecran.setPreferredSize(new Dimension(220,30));
	      	label.setBorder(BorderFactory.createLineBorder(Color.black));
	      	ecran.add(label);
	      	
	      	//chifre 
	      	
	      	
	      JPanel chiffre =new JPanel();
	    chiffre.setPreferredSize(new Dimension(165,225));
	    // la creation des buttons
	    		JButton bouton0 = new JButton("0");bouton0.setPreferredSize(new Dimension(50,40));   
	    		JButton bouton1 = new JButton("1");bouton1.setPreferredSize(new Dimension(50,40));
	    		JButton bouton2 = new JButton("2");bouton2.setPreferredSize(new Dimension(50,40));
	    		JButton bouton3 = new JButton("3");bouton3.setPreferredSize(new Dimension(50,40));
	    		JButton bouton4 = new JButton("4");bouton4.setPreferredSize(new Dimension(50,40));
	    		JButton bouton5 = new JButton("5");bouton5.setPreferredSize(new Dimension(50,40));
	    		JButton bouton6 = new JButton("6");bouton6.setPreferredSize(new Dimension(50,40));
	    		JButton bouton7 = new JButton("7");bouton7.setPreferredSize(new Dimension(50,40));
	    		JButton bouton8 = new JButton("8");bouton8.setPreferredSize(new Dimension(50,40));
	    		JButton bouton9 = new JButton("9");bouton9.setPreferredSize(new Dimension(50,40));
	    		JButton boutonVirgule = new JButton(",");boutonVirgule.setPreferredSize(new Dimension(50,40));
	    		JButton boutonEgale = new JButton("=");boutonEgale.setPreferredSize(new Dimension(50,40));
	    		
	    		
	    		
	    		//ajouter les button sur l espace chiffre
	    		chiffre.add(bouton1);
	    		chiffre.add(bouton2);
	    		chiffre.add(bouton3);
	    		chiffre.add(bouton4);
	    		chiffre.add(bouton5);
	    		chiffre.add(bouton6);
	    		chiffre.add(bouton7);
	    		chiffre.add(bouton8);
	    		chiffre.add(bouton9);
	    		chiffre.add(bouton0);
	    		chiffre.add(boutonVirgule);
	    		chiffre.add(boutonEgale);
	    		
	    		
	      //operateur
	    		
	      	
	    		 JPanel operateur =new JPanel();
	    		   operateur.setPreferredSize(new Dimension(55,225));
	    		   
	    		   JButton boutonC = new JButton("C");boutonC.setPreferredSize(new Dimension(45,31));
	       		JButton boutonPlus = new JButton("+");boutonPlus.setPreferredSize(new Dimension(45,31));
	       		JButton boutonMoins = new JButton("-");boutonMoins.setPreferredSize(new Dimension(45,31));
	       		JButton boutonMul = new JButton("*");boutonMul.setPreferredSize(new Dimension(45,31));
	       		JButton boutonDiv = new JButton("/");boutonDiv.setPreferredSize(new Dimension(45,31));
	      	
	       		operateur.add(boutonC);
	    		operateur.add(boutonPlus);
	    		operateur.add(boutonMoins);
	    		operateur.add(boutonMul);
	    		operateur.add(boutonDiv);
	    	
	    //les calcules 
	    		
	    		
	    		
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	
	      	contenuFenetre.add(ecran,BorderLayout.NORTH);
	     	contenuFenetre.add(chiffre,BorderLayout.CENTER);
	     	contenuFenetre.add(operateur,BorderLayout.EAST);
	     	
	      	fenetre.setContentPane(contenuFenetre);
	      	
	        fenetre.setVisible(true);
	          }
		public static void main(String[] args) {
			
	   Cal calculatrice = new Cal ();
		}

	}


