package n1exercici1;

public class InstrumentCorda extends Instrument {
	
	static {
		// El bloc nomès s'executarà el primer cop que es carregui la classe,
		// abans d'inicialitzar cap objecte i entrar al constructor.
		System.out.println("Has carregat la classe InstrumentCorda.");
	}
	
	{
		// El bloc s'executarà cada cop que s'instancïi un objecte de la classe.
		System.out.println("Has inicialitzat un Instrument de Corda.");
	}
	
	public InstrumentCorda(String nom, int preu) {
		super(nom, preu);
		//Desprès de cridar al super, es crida al bloc d'inicialització automàticament.
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda.");
	}
	
	@Override
	public String toString() {
		return "Sóc un/a " + nom + " i pertanyo als Instruments de Corda. Tinc un cost de " + preu + " €";
	}
}
