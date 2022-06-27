package n3exercici1;

public abstract class Noticia {
	
	// Atributs demanats per l'exercici
	private String titular;
	private String text;
	private int puntuacio;
	private int preu;
	
	// Constructor
	public Noticia(String titular) {
		this.titular = titular;
		this.text = "";
	}
	
	// Getters
	public String getTitular() {
		return titular;
	}

	public String getText() {
		return text;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public int getPreu() {
		return preu;
	}

	// Setters

	public void setText(String text) {
		this.text = text;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}


	// Mètodes demanats per l'exercici
	public abstract void calcularPreuNoticia();
	public abstract void calcularPuntuacioNoticia();
	
	
}
