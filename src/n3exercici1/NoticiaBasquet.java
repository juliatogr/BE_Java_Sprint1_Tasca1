package n3exercici1;

public class NoticiaBasquet extends Noticia {
	
	public static final int PREU_INICIAL = 250;
	public static final int PREU_EUROLLIGA = 75;
	public static final int PREU_BARCA_MADRID = 75;
	
	public static final int PUNT_INICIAL = 4;
	public static final int PUNT_EUROLLIGA = 3;
	public static final int PUNT_ACB = 2;
	public static final int PUNT_BARCA_MADRID = 1;
	
	private String competicio;
	private String club;
	
	public NoticiaBasquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}
	public void calcularPreuNoticia() {
		
		int preu_temp = PREU_INICIAL;
		
		if (competicio.equalsIgnoreCase("Eurolliga")) {
			preu_temp += PREU_EUROLLIGA;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			preu_temp += PREU_BARCA_MADRID;
		}
		
		this.setPreu(preu_temp);
		
		System.out.println("El preu de la notícia de bàsquet '" + this.getTitular() + "' és de " + preu_temp + "€.");
	}
	
	public void calcularPuntuacioNoticia() {
		
		int punt_temp = PUNT_INICIAL;
		
		if (competicio.equalsIgnoreCase("Eurolliga")) {
			punt_temp += PUNT_EUROLLIGA;
		} else if (competicio.equalsIgnoreCase("ACB")) {
			punt_temp += PUNT_ACB;
		}
		
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
			punt_temp += PUNT_BARCA_MADRID;
		}
		
		this.setPuntuacio(punt_temp);
		
		System.out.println("La puntuació de la notícia de bàsquet '" + this.getTitular() + "' és de " + punt_temp + " punts.");
	}
	
	@Override
	public String toString() {
		return "Noticia de Basquet amb titular '" + this.getTitular() + "' sobre la competició " + competicio + " i el club " + club + 
				". Té una puntuació " + this.getPuntuacio()  + " i un preu " + this.getPreu() + 
				".\n      Text de la notícia: '" + this.getText() + "'";
	}
}
