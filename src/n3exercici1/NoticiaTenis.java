package n3exercici1;

public class NoticiaTenis extends Noticia {
	
	public static final int PREU_INICIAL = 150;
	public static final int PREU_FEDERER_NADAL_DJOKOVIC = 100;
	
	public static final int PUNT_INICIAL = 4;
	public static final int PUNT_FEDERER_NADAL_DJOKOVIC = 3;
	
	private String competicio;
	private String tenista;
	
	public NoticiaTenis(String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;
	}
	
	public void calcularPreuNoticia() {
		
		int preu_temp = PREU_INICIAL;
		
		if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")) {
			preu_temp += PREU_FEDERER_NADAL_DJOKOVIC;
		}
		
		this.setPreu(preu_temp);
		
		System.out.println("El preu de la not�cia de tenis '" + this.getTitular() + "' �s de " + preu_temp + "�.");
	}
	
	public void calcularPuntuacioNoticia() {
		
		int punt_temp = PUNT_INICIAL;
		
		if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")) {
			punt_temp += PUNT_FEDERER_NADAL_DJOKOVIC;
		}
		
		this.setPuntuacio(punt_temp);
		
		System.out.println("La puntuaci� de la not�cia de tenis '" + this.getTitular() + "' �s de " + punt_temp + " punts.");
	}
	
	@Override
	public String toString() {
		return "Noticia de Tenise amb titular '" + this.getTitular() + "' sobre la competici� " + competicio + " i el tenista " + tenista + 
				". T� una puntuaci� " + this.getPuntuacio()  + " i un preu " + this.getPreu() + 
				".\n      Text de la not�cia: '" + this.getText() + "'";
	}
}
