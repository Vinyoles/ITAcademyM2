package Nivell1;
import javax.swing.JOptionPane;


public class Fase1 {

	public static void main(String[] args) {
		//FASE 1
		
		//Demana a l'usuari que introdueixi nom i cognoms
		String nomICognoms = JOptionPane.showInputDialog("Introduiu el vostre nom i cognoms");
		
		//agafa les dades de nom i cognoms i les guarda en un array, lletra per lletra
		char[] lletresNom = new char[nomICognoms.length()];
		
		for(int i=0; i<nomICognoms.length(); i++) {
			lletresNom[i] = nomICognoms.charAt(i);
		}
		
		//mostra per consola cadascuna de les lletres
		for (int i=0; i<lletresNom.length; i++) {
			System.out.println(lletresNom[i]);
		}
	}
}
