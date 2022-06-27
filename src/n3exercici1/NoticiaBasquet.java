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
		if (club.equalsIgnoreCase("Bar�a") || club.equalsIgnoreCase("Madrid")) {
			preu_temp += PREU_BARCA_MADRID;
		}
		
		this.setPreu(preu_temp);
		
		System.out.println("El preu de la not�cia de b�squet '" + this.getTitular() + "' �s de " + preu_temp + "�.");
	}
	
	public void calcularPuntuacioNoticia() {
		
		int punt_temp = PUNT_INICIAL;
		
		if (competicio.equalsIgnoreCase("Eurolliga")) {
			punt_temp += PUNT_EUROLLIGA;
		} else if (competicio.equalsIgnoreCase("ACB")) {
			punt_temp += PUNT_ACB;
		}
		
		if (club.equalsIgnoreCase("Bar�a") || club.equalsIgnoreCase("Madrid")) {
			punt_temp += PUNT_BARCA_MADRID;
		}
		
		this.setPuntuacio(punt_temp);
		
		System.out.println("La puntuaci� de la not�cia de b�squet '" + this.getTitular() + "' �s de " + punt_temp + " punts.");
	}
	
	@Override
	public String toString() {
		return "Noticia de Basquet amb titular '" + this.getTitular() + "' sobre la competici� " + competicio + " i el club " + club + 
				". T� una puntuaci� " + this.getPuntuacio()  + " i un preu " + this.getPreu() + 
				".\n      Text de la not�cia: '" + this.getText() + "'";
	}
}
