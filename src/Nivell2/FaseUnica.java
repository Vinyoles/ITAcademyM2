package Nivell2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FaseUnica {

	public static void main(String[] args) {
		
		///Números
		int numeroLinies = Integer.parseInt(JOptionPane.showInputDialog("Introduiu el número de línies que voleu representar:"));
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i=0; i<numeroLinies; i++) {
			numeros.add(i+1);
			
			for (int j=0; j<numeros.size(); j++) {
				System.out.print(numeros.get(j) + "	");
			}
			System.out.println();
		}
		
		///Asteriscs
		int numeroLiniesAsteriscs = Integer.parseInt(JOptionPane.showInputDialog("Introduiu el número de línies que voleu representar:"));
		int comptadorTabulacionsInicials = 0;
		ArrayList<Character> asteriscs = new ArrayList <Character> ();
		
		//crea la primera línia d'asteriscs
		int numeroAsteriscsMaxAmplitud = numeroLiniesAsteriscs + (numeroLiniesAsteriscs - 1); //agafa la línia més ample i li afegeix la meitat de la dreta, fent la piràmide simètrica a l'asterisc central
		for (int i=0; i<numeroAsteriscsMaxAmplitud; i++) {
			asteriscs.add('*');
		}
		
		//dibuixa les línies amb asteriscs
		for (int i=0; i<numeroLiniesAsteriscs; i++) {
			for (int j=0; j<asteriscs.size(); j++){
				System.out.print(asteriscs.get(j) + "	");
			}
			System.out.println();
			
			//imprimeix tabulacions a l'inici perquè tingui la forma de piràmida
			comptadorTabulacionsInicials++;
			for (int j=0; j<comptadorTabulacionsInicials; j++) {
				System.out.print("	");
			}
			
			//suprimeix els asteriscs sobrers
			asteriscs.remove(0);
			if (asteriscs.size() > 1) { //aquesta condició és per la última línia, quan només queda un asterisc
				asteriscs.remove(1);
			}
		}	
	}
}
