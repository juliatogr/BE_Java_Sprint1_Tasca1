package n1exercici1;

public abstract class Instrument {
	protected final String nom;
	protected int preu;
	
	
	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int p) {
		this.preu = p;
	}


	public abstract void tocar();
}
