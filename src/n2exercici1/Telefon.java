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

	// Mètode demanat per l'exercici
	public void trucar(String num) {
		System.out.println("S'està trucant al número " + num);
	}
	
}
