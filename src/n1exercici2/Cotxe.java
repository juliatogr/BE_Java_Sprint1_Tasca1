package n1exercici2;

public class Cotxe {
	
	// Atributs per especificar un id i identificar cada cotxe
	// Un comptador idCounter que es vagi sumant cada cop que instanciem
	// un objecte Cotxe i que, com és estàtic, tots els cotxes tindràn el
	// mateix valor. Per tant, podem assignar a id el valor de idCounter
	// del moment de la instanciació.
	private static int idCounter = 1;
	private final int id;
	
	// A un atribut static final no se li pot assignar valor en el constructor,
	// ha de fer-se en el moment de la declaració de l'atribut.
	private static final String marca = "Nissan";
	
	// A un atribut static se li pot assignar valor en el constructor però en un
	// contexte static. Tot i així, ja vindrà inicialitzat amb un valor per defecte.
	// En aquest cas dirà que és null. 
	// Cada cop que s'instancii un objecte assignant valor a model, 
	// canviarà el model a tots els objectes instanciats de la classe Cotxe. 
	private static String model;
	
	// A un atribut final se li pot assignar valor en el constructor i, de fet, si no es
	// fa en el moment de la declaració, el programa obliga a posar-li valor en constructor.
	private final int potencia;
	
	
	// Constructors per fer els exemples
	public Cotxe(int potencia) {
		this.potencia = potencia;
		this.id = idCounter;
		idCounter++;
	}
	
	public Cotxe(String model, int potencia) {
		Cotxe.model = model;
		this.potencia = potencia;
		this.id = idCounter;
		idCounter++;
	}
	
	// Getters
	public int getId() {
		return this.id;
	}
	public static String getMarca() {
		return marca;
	}
	public static String getModel() {
		return model;
	}
	public int getPotencia() {
		return this.potencia;
	}
	
	// Setters
	public static void setModel(String m) {
		model = m;
	}
	
	//No puc fer setters de marca i potencia ja que són final
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//	public void setPotencia(int potencia) {
//		this.potencia = potencia;
//	}

	
	// Mètodes requerits per l'exercici
	public static void frenar() {
		System.out.println("El vehicle està frenant.");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant.");
	}
	
	// toString() per poder imprimir correctament la classe.
	@Override
	public String toString() {
		return "Cotxe " + id + ": " + marca +" " + model + " amb potència " + potencia + ".";
	}
}
