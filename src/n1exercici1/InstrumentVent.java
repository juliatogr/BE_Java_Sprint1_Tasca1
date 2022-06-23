package n1exercici1;

public class InstrumentVent extends Instrument {
	
	static int ATRIBUT_ESTATIC = 3;
	static {
		// El bloc nomès s'executarà el primer cop que es carregui la classe,
		// abans d'inicialitzar cap objecte i entrar al constructor.
		System.out.println("Has carregat la classe InstrumentVent.");
	}
	
	{
		// El bloc s'executarà cada cop que s'instancïi un objecte de la classe.
		System.out.println("Estàs instanciant un objecte de InstrumentVent.");
	}
	
	public InstrumentVent(String nom, int preu) {
		super(nom, preu);
		//Desprès de cridar al super, es crida al bloc d'inicialització automàticament.
		// Després, continua amb el codi del constructor.
		System.out.println("Has instanciat un objecte de InstrumentVent");
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent.");
	}

	@Override
	public String toString() {
		return "Sóc un/a " + nom + " i pertanyo als Instruments de Vent. Tinc un cost de " + preu + " €";
	}
	
}
