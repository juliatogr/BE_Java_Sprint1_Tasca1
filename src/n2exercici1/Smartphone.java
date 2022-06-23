package n2exercici1;

public class Smartphone extends Telefon 
	implements Camera, Rellotge {
	
	public Smartphone(String marca, String model) {
		super(marca,model);
	}
	
	public void fotografiar() {
		System.out.println("S'est� fent una foto");
	}
	
	public void alarma() {
		System.out.println("Est� sonant l'alarma");
	}
	
	@Override
	public String toString() {
		return "Smartphone " + this.getMarca() + " " + this.getModel();
	}
}
