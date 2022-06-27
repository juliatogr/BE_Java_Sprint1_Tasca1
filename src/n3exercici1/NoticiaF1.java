package n3exercici1;

public class NoticiaF1 extends Noticia {
	public static final int PREU_INICIAL = 100;
	public static final int PREU_FERRARI_MERCEDES = 50;
	
	public static final int PUNT_INICIAL = 6;
	public static final int PUNT_FERRARI_MERCEDES = 2;
	
	private String escuderia;
	
	public NoticiaF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}
	
	public void calcularPreuNoticia() {
		
		int preu_temp = PREU_INICIAL;
		
		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
			preu_temp += PREU_FERRARI_MERCEDES;
		}
		
		this.setPreu(preu_temp);
		
		System.out.println("El preu de la notícia de F1 '" + this.getTitular() + "' és de " + preu_temp + "€.");
	}
	
	public void calcularPuntuacioNoticia() {
		
		int punt_temp = PREU_INICIAL;
		
		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
			punt_temp += PREU_FERRARI_MERCEDES;
		}
		
		this.setPuntuacio(punt_temp);
		
		System.out.println("El punt de la notícia de F1 '" + this.getTitular() + "' és de " + punt_temp + " punts.");
	}
	
	@Override
	public String toString() {
		return "Noticia de F1 amb titular '" + this.getTitular() + "' sobre l'escuderia " + escuderia + 
				". Té una puntuació " + this.getPuntuacio()  + " i un preu " + this.getPreu() + 
				".\n      Text de la notícia: '" + this.getText() + "'";
	}
}
