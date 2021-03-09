package Nivell3;

public class FaseUnica {
	
	public static void main(String[] args) throws InterruptedException {
		
		//defineix les variables que es faran servir pel rellotge
		int hour = 0;
		int minutes = 0;
		int seconds = 0;
		
		for (int i=0; i<61; i++) {
			
			//reseteja els segons quan passa un minut
			if (seconds == 60) {
				i=0;
				seconds = 0;
				minutes++;
			}
			
			//reseteja els minuts quan passa una hora
			if (minutes == 60) {
				minutes = 0;
				hour++;
			}
			
			//reseteja les hores quan passa un dia sencer
			if (hour == 24) {
				hour = 0;
			}
			
			//pausa 1000 ms l'execució de cada "volta" del loop
			Thread.sleep(1000);
			
			//converteix els números del 0 al 9 a strings del 00 al 09 i els ploteja
			System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
			seconds++;
		}
	}
}
