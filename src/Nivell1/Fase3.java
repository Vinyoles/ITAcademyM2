package Nivell1;
import java.util.*;
import javax.swing.JOptionPane;

public class Fase3 {

	public static void main(String[] args) {
		//Fase 3		
		
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
		
		//Enmagatzema a un hashmap les diferentes lletres, conjuntament amb el número de vegades que apareixen
		HashMap <Character, Integer> ocurrenciaLletres = new HashMap <Character, Integer> ();
		
		for (int i=0; i<lletresNom.size(); i++) {
			int j = 0; //defineix una variable temporal j per guardar-hi el número de repeticions de cada lletra
			
			//busca el número de cops que apareix la lletra amb index "i" i l'enmagatzema a la variable j.
			for (int k=0; k<lletresNom.size();k++) {
				if (lletresNom.get(k) == lletresNom.get(i)) {
					j++;
				}
			}
			
			//guarda tot excepte els espais
			if (lletresNom.get(i) != ' '){
				ocurrenciaLletres.put(lletresNom.get(i), j);
			}
		}
		
		System.out.println(ocurrenciaLletres);
		
	}
}
