package n3exercici1;

public class NoticiaFutbol extends Noticia {
	
	public static final int PREU_INICIAL = 300;
	public static final int PREU_LLIGACAMPIONS = 100;
	public static final int PREU_BARCA_MADRID = 100;
	public static final int PREU_TORRES_BENZEMA = 50;
	
	public static final int PUNT_INICIAL = 5;
	public static final int PUNT_LLIGACAMPIONS = 3;
	public static final int PUNT_LLIGA = 2;
	public static final int PUNT_BARCA_MADRID = 1;
	public static final int PUNT_TORRES_BENZEMA = 1;
	
	private String competicio;
	private String club;
	private String jugador;
	
	public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}
	public void calcularPreuNoticia() {
		
		int preu_temp = PREU_INICIAL;
		
		if (competicio.equalsIgnoreCase("Lliga de Campions")) {
			preu_temp += PREU_LLIGACAMPIONS;
		}
		if (club.equalsIgnoreCase("Bar�a") || club.equalsIgnoreCase("Madrid")) {
			preu_temp += PREU_BARCA_MADRID;
		}
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			preu_temp += PREU_TORRES_BENZEMA;
		}
		this.setPreu(preu_temp);
		
		System.out.println("El preu de la not�cia de f�tbol '" + this.getTitular() + "' �s de " + preu_temp + "�.");
	}
	
	public void calcularPuntuacioNoticia() {
		
		int punt_temp = PUNT_INICIAL;
		
		if (competicio.equalsIgnoreCase("Lliga de Campions")) {
			punt_temp += PUNT_LLIGACAMPIONS;
		} else if (competicio.equalsIgnoreCase("Lliga")) {
			punt_temp += PUNT_LLIGA;
		}
		
		if (club.equalsIgnoreCase("Bar�a") || club.equalsIgnoreCase("Madrid")) {
			punt_temp += PUNT_BARCA_MADRID;
		}
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			punt_temp += PUNT_TORRES_BENZEMA;
		}
		this.setPuntuacio(punt_temp);
		
		System.out.println("La puntuaci� de la not�cia de f�tbol '" + this.getTitular() + "' �s de " + punt_temp + " punts.");
	}
	@Override
	public String toString() {
		return "Noticia de Futbol amb titular '" + this.getTitular() + "' sobre la competici� " + competicio + ", el club " + club + " i el jugador " + jugador + 
				". T� una puntuaci� " + this.getPuntuacio()  + " i un preu " + this.getPreu() + 
				".\n      Text de la not�cia: '" + this.getText() + "'";
	}
	
	
}
