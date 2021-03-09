package Nivell1;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Fase2 {

	public static void main(String[] args) {
		//FASE 2
		
		//Demana a l'usuari que introdueixi nom i cognoms
		String nomICognoms = JOptionPane.showInputDialog("Introduiu el vostre nom i cognoms");
		
		
		//Pregunta de forma recurrent el nom a l'usuari fins que l'escrigui sense números.
		boolean nomCorrecte;
		do {
			nomCorrecte = true;
			for (int i=0; i<nomICognoms.length(); i++) {
				if (Character.isDigit(nomICognoms.charAt(i))) {
					nomCorrecte = false;
				}
			}
			
			if (nomCorrecte == false) {
				nomICognoms = JOptionPane.showInputDialog("Els noms de persones no contenen números! Introduiu el vostre nom i cognoms de nou");
			}
			
		} while (nomCorrecte == false);
		
		
		//agafa les dades de nom i cognoms i les guarda en una llista, lletra per lletra
		ArrayList<Character> lletresNom = new ArrayList<Character>();
		
		for(int i=0; i<nomICognoms.length(); i++) {
			lletresNom.add(nomICognoms.charAt(i));
		}
		
		
		//mostra per consola cadascuna de les lletres, indicant si són vocals o consonants
		ArrayList<Character> vocals = new ArrayList<Character>(); //guarda les vocals en una arrayList
		vocals.add('a');
		vocals.add('e');
		vocals.add('i');
		vocals.add('o');
		vocals.add('u');
		
		vocals.add('A');
		vocals.add('E');
		vocals.add('I');
		vocals.add('O');
		vocals.add('U');
		
		
		for (int i=0; i<lletresNom.size(); i++) {
			if (vocals.contains(lletresNom.get(i))){
				System.out.println(lletresNom.get(i) + " VOCAL");
			} else if (lletresNom.get(i) == ' ') {
				System.out.println(' ');
			} else {
				System.out.println(lletresNom.get(i) + " CONSONANT");
			}
		}
	}
}
