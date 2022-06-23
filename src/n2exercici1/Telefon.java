package n2exercici1;

public class Telefon {
	private final String marca;
	private final String model;
	
	// Constructor
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	// Getters
	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	// M�tode demanat per l'exercici
	public void trucar(String num) {
		System.out.println("S'est� trucant al n�mero " + num);
	}
	
}
