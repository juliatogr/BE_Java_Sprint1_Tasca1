package n3exercici1;

public class NoticiaMotociclisme extends Noticia {
	
	public static final int PREU_INICIAL = 100;
	public static final int PREU_HONDA_YAMAHA = 50;
	
	public static final int PUNT_INICIAL = 3;
	public static final int PUNT_HONDA_YAMAHA = 3;
	
	private String equip;
	
	public NoticiaMotociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}
	
	public void calcularPreuNoticia() {
		
		int preu_temp = PREU_INICIAL;
		
		if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
			preu_temp += PREU_HONDA_YAMAHA;
		}
		
		this.setPreu(preu_temp);
		
		System.out.println("El preu de la notícia de motociclisme '" + this.getTitular() + "' és de " + preu_temp + "€.");
	}
	
	public void calcularPuntuacioNoticia() {
		
		int punt_temp = PUNT_INICIAL;
		
		if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) {
			punt_temp += PUNT_HONDA_YAMAHA;
		}
		
		this.setPuntuacio(punt_temp);
		
		System.out.println("El punt de la notícia de motociclisme '" + this.getTitular() + "' és de " + punt_temp + " punts.");
	}
	
	@Override
	public String toString() {
		return "Noticia de Motociclisme amb titular '" + this.getTitular() + "' sobre l'equip " + equip + 
				". Té una puntuació " + this.getPuntuacio()  + " i un preu " + this.getPreu() + 
				".\n      Text de la notícia: '" + this.getText() + "'";
	}
}
