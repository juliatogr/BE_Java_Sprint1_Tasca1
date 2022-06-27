package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class N3_E1_main {

	public static void main(String[] args) {
		
		ArrayList<Redactor> redactors = new ArrayList<Redactor>();
		
		
		redactors.add(new Redactor("Marc Ginés", "48394681F"));
		redactors.add(new Redactor("Andrea Pons", "35747198T"));
		redactors.add(new Redactor("Pau Serra", "41938739N"));
		
		redactors.get(0).afegirNoticia(new NoticiaFutbol("El Messi se'n va del barça", "Lliga de Campions", "Barça", "Messi"));
		redactors.get(2).afegirNoticia(new NoticiaBasquet("Pau Gasol lesionat", "ACB", "Pau Gasol"));
		redactors.get(2).afegirNoticia(new NoticiaTenis("Rafa Nadal guanya una altra copa", "Eurolliga", "Nadal"));
		
		System.out.println();
		
		boolean sortir = false;
		
		while(!sortir) {
			switch(menuPrincipal()) {
			case 1: introduirRedactor(redactors);
				break;
			case 2: eliminarRedactor(redactors);
				break;
			case 3: introduirNoticia(redactors);
				break;
			case 4: eliminarNoticia(redactors);
				break;
			case 5:	mostrarNoticies(redactors);
				break;
			case 6:	calcularPuntuacioNoticia(redactors);
				break;
			case 7:	calcularPreuNoticia(redactors);
				break;
			case 0:
				sortir = true;
				break;
			}
		}
	}
	
	// Accions principals
	public static void introduirRedactor(ArrayList<Redactor> redactors) {
		
		// Mètode per introduir un redactor amb un dni en concret i que no estigui ja a la BD
		
		System.out.println("****Introduir un redactor****");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String dni = askDni();
		
		Redactor red = buscarRedactor(redactors, dni); // Busca el redactor
		
		if (red == null) {			// Si no hi és, l'afegeix
			System.out.println("Introdueix el nom del redactor:");
			String nom = sc.nextLine();
			
			redactors.add(new Redactor(nom, dni));
		} else {					// Si ja hi és, mostra el missatge d'avís
			System.out.println("Ja existeix un redactor amb el DNI " + dni + ".");
		}
		
	}
	
	public static void eliminarRedactor(ArrayList<Redactor> redactors) {
		
		// Mètode per elminiar un redactor amb un dni en concret i que ja estigui a la BD
		
		System.out.println("****Eliminar un redactor****");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String dni = askDni();
		
		Redactor red = buscarRedactor(redactors, dni);		// Busca el redactor
		
		if (red == null) {			// Si no hi és, mostra el missatge d'error
			System.out.println("No existeix un redactor amb el DNI " + dni + ".");
		} else {					// Si ja hi és, l'elimina
			redactors.remove(red);
			System.out.println("Redactor eliminat.");
		}
	}
	
	public static void introduirNoticia(ArrayList<Redactor> redactors) {
		
		// Mètode per introduir una Noticia a un redactor amb un dni en concret.
			
		System.out.println("****Introduir una notícia****");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		// Busquem el redactor
		System.out.println("A quin redactor voldràs assignar-li la notícia?");
		imprimirRedactors(redactors);
		System.out.println();
		
		Redactor red = null;
		
		while (red == null) {
			
			String dni = askDni();
			red = buscarRedactor(redactors, dni);
			
			if (red == null) {
				System.out.println("No tenim cap redactor amb el DNI " + dni);
			}
		}
		
		// La notícia s'identifica pel titular.
		System.out.println("Introdueix el titular de la notícia:");
		String titular = sc.nextLine();
		
		Noticia not = red.buscarNoticia(titular);
		// L'usuari escull el tipus de notícia i cridem al mètode corresponent.
		
		if (not == null) {
			boolean enrere = false;
		
			while(!enrere) {
				switch(menuAddNoticia()) {
				case 1: introduirNoticiaFutbol(red, titular);
					break;
				case 2: introduirNoticiaBasquet(red, titular);
					break;
				case 3: introduirNoticiaTenis(red, titular);
					break;
				case 4: introduirNoticiaF1(red, titular);
					break;
				case 5:	introduirNoticiaMotociclisme(red, titular);
					break;
				case 0:
					enrere = true;
					break;
				}
			}
		}
		else {
			System.out.println("La notícia ja existeix.");
		}

	}
	
	public static void eliminarNoticia(ArrayList<Redactor> redactors) {
		
		// Mètode per eliminar una noticia amb un titular en concret.
		
		System.out.println("****Eliminar una notícia****");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		// Busquem el redactor al que li correspon segons el seu DNI
		System.out.println("A quin redactor correspon la notícia?");
		imprimirRedactors(redactors);
		System.out.println();
		
		Redactor red = null;
		
		while (red == null) {
			
			String dni = askDni();
			red = buscarRedactor(redactors, dni);
			
			if (red == null) {
				System.out.println("No tenim cap redactor amb el DNI " + dni);
			}
		}
		// Eliminem la noticia segons el titular.
		System.out.println("Introdueix el titular de la notícia:");
		String titular = sc.nextLine();
		
		Noticia not = red.buscarNoticia(titular);
		// L'usuari escull el tipus de notícia i cridem al mètode corresponent.
		
		if (not == null) {
			System.out.println("La noticia no existeix");
		} else {
			red.eliminarNoticia(titular);
		}
		
	}
	
	public static void mostrarNoticies(ArrayList<Redactor> redactors) {
		
		// Mètode per mostrar totes les noticies per cada redactor
		
		System.out.println("****Notícies per redactor****");
		System.out.println();
		
		int numRedactors = redactors.size();
		
		for (int i=0; i < numRedactors; i++) {
			 redactors.get(i).imprimirNoticies();
			 System.out.println();
		}
		
		System.out.println();
	}
	
	public static void calcularPuntuacioNoticia(ArrayList<Redactor> redactors) {
		
		// Mètode per calcular la puntuació d'una notícia identificada per un
		// titular i el redactor al que li correspon.
		
		System.out.println("****Calcular la puntuació d'una notícia****");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A quin redactor correspon la notícia?");
		imprimirRedactors(redactors);
		System.out.println();
		
		Redactor red = null;
		
		while (red == null) {
			
			String dni = askDni();
			red = buscarRedactor(redactors, dni);
			
			if (red == null) {
				System.out.println("No tenim cap redactor amb el DNI " + dni);
			}
		}
		
		System.out.println("Introdueix el titular de la notícia:");
		String titular = sc.nextLine();
		
		Noticia not = red.buscarNoticia(titular);
		
		if (not == null) {
			System.out.println("No existeix cap notícia amb titular " + titular + " per aquest redactor.");
		} else {
			not.calcularPuntuacioNoticia();
		}
	}
	
	public static void calcularPreuNoticia(ArrayList<Redactor> redactors) {
		
		// Mètode per calcular el preu d'una notícia identificada per un
		// titular i el redactor al que li correspon.
		
		System.out.println("****Calcular el preu d'una notícia****");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A quin redactor correspon la notícia?");
		imprimirRedactors(redactors);
		System.out.println();
		
		Redactor red = null;
		
		while (red == null) {
			
			String dni = askDni();
			red = buscarRedactor(redactors, dni);
			
			if (red == null) {
				System.out.println("No tenim cap redactor amb el DNI " + dni);
			}
		}
		
		System.out.println("Introdueix el titular de la notícia:");
		String titular = sc.nextLine();
		
		Noticia not = red.buscarNoticia(titular);
		
		if (not == null) {
			System.out.println("No existeix cap notícia amb titular " + titular + " per aquest redactor.");
		} else {
			not.calcularPreuNoticia();
		}
	}
	
	// Menús
	
	public static byte menuPrincipal() {
		
		System.out.println("Què vols fer?");
		System.out.println("   1.- Introduir un redactor");
		System.out.println("   2.- Eliminar un redactor");
		System.out.println("   3.- Introduir una notícia a un redactor");
		System.out.println("   4.- Eliminar una notícia");
		System.out.println("   5.- Mostrar totes les notícies per redactor");
		System.out.println("   6.- Calcular la puntuació de la notícia");
		System.out.println("   7.- Calcular el preu de la notícia");
		System.out.println("   0.- Sortir");
		
		Scanner sc = new Scanner(System.in);
		
		byte opt = -1;
		
		while (opt < 0 || opt > 7) {
			
			opt = sc.nextByte();
			
			if (opt < 0 || opt > 7) {
				System.out.println("L'opció no és vàlida. Ha de ser un número entre 0 i 7.");
			}	
		}
		return opt;
	}

	
	public static byte menuAddNoticia() {
		
		System.out.println("Quin tipus de notícia vols afegir?");
		System.out.println("   1.- Afegir una notícia de fútbol");
		System.out.println("   2.- Afegir una notícia de bàsquet");
		System.out.println("   3.- Afegir una notícia de tenis");
		System.out.println("   4.- Afegir una notícia de F1");
		System.out.println("   5.- Afegir una notícia de motociclisme");
		System.out.println("   0.- Tornar enrere");
		
		Scanner sc = new Scanner(System.in);
		
		byte opt = -1;
		
		while (opt < 0 || opt > 5) {
			
			opt = sc.nextByte();
			
			if (opt < 0 || opt > 5) {
				System.out.println("L'opció no és vàlida. Ha de ser un número entre 0 i 5.");
			}	
		}
		return opt;
	}
	
	// Útils
	
	public static String askDni() {
		
		Scanner sc = new Scanner(System.in);
		
		String dni = "";
		
		while (dni.length() != 9 || !Character.isLetter(dni.charAt(8))){
			System.out.println("Introdueix el DNI:");
			dni = sc.nextLine();
			
			if (dni.length() != 9 || !Character.isLetter(dni.charAt(8))){
				System.out.println("El format no és vàlid. Ha de ser del tipus '12345678A'.");
			}
		}
		
		return dni;
	}

	public static Redactor buscarRedactor(ArrayList<Redactor> redactors, String dni) {
		
		Redactor red = null;
		int idx = 0;
		int numRedactors = redactors.size();
		while (idx<numRedactors && red == null) {
			Redactor redTemp = redactors.get(idx);
			if (dni.equalsIgnoreCase(redTemp.getDni())){
				red = redTemp;
			}
			idx++;
		}
		return red;
	}
	
	public static void imprimirRedactors(ArrayList<Redactor> redactors) {
		
		System.out.println("Redactors actuals:\n");
		int numRedactors = redactors.size();
		for (int i=0; i<numRedactors; i++) {
			System.out.println("    - " + redactors.get(i).toString());
		}
	}
	
	public static void introduirNoticiaFutbol(Redactor red, String titular) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix la competició de la que es tracta:");
		String comp = sc.nextLine();
		
		System.out.println("Introdueix el club del que tracta:");
		String club = sc.nextLine();
		
		System.out.println("Introdueix el jugador del que tracta:");
		String jugador = sc.nextLine();
		
		red.afegirNoticia(new NoticiaFutbol(titular, comp, club, jugador));
		
	}
	
	public static void introduirNoticiaBasquet(Redactor red, String titular) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix la competició de la que es tracta:");
		String comp = sc.nextLine();
		
		System.out.println("Introdueix el club del que tracta:");
		String club = sc.nextLine();
		
		red.afegirNoticia(new NoticiaBasquet(titular, comp, club));
		
	}
	
	public static void introduirNoticiaTenis(Redactor red, String titular) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix la competició de la que es tracta:");
		String comp = sc.nextLine();
		
		System.out.println("Introdueix el tenista del que tracta:");
		String tenista = sc.nextLine();
		
		red.afegirNoticia(new NoticiaTenis(titular, comp, tenista));
		
	}
	
	public static void introduirNoticiaF1(Redactor red, String titular) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix l'escuderia de la que es tracta:");
		String esc = sc.nextLine();
		
		red.afegirNoticia(new NoticiaF1(titular, esc));
		
	}
	
	public static void introduirNoticiaMotociclisme(Redactor red, String titular) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix l'equip del que tracta:");
		String equip = sc.nextLine();
		
		red.afegirNoticia(new NoticiaMotociclisme(titular, equip));
		
	}
}
